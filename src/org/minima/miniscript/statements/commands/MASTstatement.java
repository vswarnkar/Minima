package org.minima.miniscript.statements.commands;

import java.util.List;

import org.minima.miniscript.Contract;
import org.minima.miniscript.exceptions.ExecutionException;
import org.minima.miniscript.exceptions.MinimaParseException;
import org.minima.miniscript.expressions.Expression;
import org.minima.miniscript.statements.Statement;
import org.minima.miniscript.statements.StatementBlock;
import org.minima.miniscript.statements.StatementParser;
import org.minima.miniscript.tokens.Token;
import org.minima.miniscript.values.HEXValue;
import org.minima.miniscript.values.ScriptValue;
import org.minima.objects.Transaction;
import org.minima.objects.base.MiniHash;
import org.minima.objects.proofs.ScriptProof;

public class MASTstatement implements Statement {

	/**
	 * The MAST script is a HEXvalue that is the hash of the script..
	 */
	Expression mMASTScript;
	
	public MASTstatement(Expression zMAST) {
		mMASTScript = zMAST;
	}
	
	@Override
	public void execute(Contract zContract) throws ExecutionException {
		//get the MAST Value..
		HEXValue mast = (HEXValue) mMASTScript.getValue(zContract);
		
		//Convert to a hash
		MiniHash scripthash = new MiniHash(mast.getRawData());
		
		//Now get that Script from the transaction..
		Transaction trans = zContract.getTransaction();
		
		//get the script of this hash value
		String script = trans.getScript(scripthash).toString();
		
		try {
			//Convert the script to KISSVM!
			List<Token> tokens = Token.tokenize(script);
		
			//And now convert to a statement block..
			StatementBlock mBlock = StatementParser.parseTokens(tokens);

			//Trace log
			zContract.traceLog("MAST [ "+script.toString()+" ]");
			
			//Now run it..
			mBlock.run(zContract);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ExecutionException(e.toString());
		}		
	}

	@Override
	public String toString() {
		return "MAST "+mMASTScript.toString();
	}
}
