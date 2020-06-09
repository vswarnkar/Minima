package org.minima.system.network.minidapps.hexdata;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.minima.objects.base.MiniData;

public class indexhtml {
	//FILE SIZE 2913
	//HEX NUM 3
	public final static int HEXNUM = 3;
	public final static byte[][] HEXDATA = new byte[3][];
	public static byte[] FINAL_ARRAY = null;
	static {
	//0 - 1000
	HEXDATA[0] = new MiniData("0x3C68746D6C3E0A3C686561643E0A0A093C6C696E6B2072656C3D227374796C6573686565742220747970653D22746578742F6373732220687265663D226373732F6D696E6964617070732E637373223E0A093C212D2D2020203C73637269707420747970653D22746578742F6A61766173637269707422207372633D226A732F6D696E696D612E6A73223E3C2F7363726970743E2D2D3E0A090A093C212D2D20203C6D657461206E616D653D2276696577706F72742220636F6E74656E743D2277696474683D3730302C20696E697469616C2D7363616C653D312C206D6178696D756D2D7363616C653D31223E202D2D3E0A0A3C2F686561643E0A0A3C626F6479207374796C653D226261636B67726F756E642D696D6167653A2075726C2874696C652D677265792E6A706567293B223E0A0A3C73637269707420747970653D22746578742F6A617661736372697074223E0A0A092F2F5761697420666F7220746865207061676520746F206C6F61642E2E0A0977696E646F772E6164644576656E744C697374656E657228226C6F6164222C2066756E6374696F6E28297B0A0909636F6E737420696E707574456C656D656E74203D20646F63756D656E742E676574456C656D656E7442794964282266696C652D696E70757422293B0A0909696E707574456C656D656E742E6164644576656E744C697374656E657228226368616E6765222C2068616E646C6546696C65732C2066616C7365293B0A09090A090966756E6374696F6E2068616E646C6546696C65732829207B0A09092020646F63756D656E742E676574456C656D656E74427949642827696E7374616C6C666F726D27292E7375626D697428293B0A09097D0A09090A09092F2A77696E646F772E6164644576656E744C697374656E657228274D696E696D614576656E74272C2066756E6374696F6E2865767429207B0A0909096966286576742E64657461696C2E6576656E74203D3D2022636F6E6E656374656422297B0A09200909094D696E696D612E7574696C2E73657455494428224D696E6948554222293B0A092009097D656C7365206966286576742E64657461696C2E6576656E74203D3D20226E6577626C6F636B22297B7D0A09202020207D293B0A09094D696E696D612E73686F776D696E696E67203D20747275653B0A09094D696E696D612E696E697428293B2A2F0A09090A097D293B0A090A0A0966756E6374696F6E20696E7374616C6C4441505028297B0A09092F2F4F70656E20612066696C65206469616C6F672E2E0A0909646F63756D656E742E676574456C656D656E7442794964282766696C652D696E70757427292E636C69636B28293B0A097D0A090A0966756E6374696F6E20756E696E7374").getData();
	//1000 - 2000
	HEXDATA[1] = new MiniData("0x616C6C44415050286E616D652C20726F6F74297B0A0909696628636F6E6669726D282241726520796F75207375726520796F75207769736820746F20756E696E7374616C6C20222B6E616D652B22203F2229297B0A0909092F2F556E696E7374616C6C207468697320726F6F74206170702E2E0A09090977696E646F772E6C6F636174696F6E2E687265663D22696E6465782E68746D6C3F756E696E7374616C6C3D222B726F6F743B0A09097D0A097D0A0A3C2F7363726970743E0A0A3C7461626C6520616C69676E3D2263656E74657222207374796C653D2270616464696E673A33303B77696474683A3730303B6865696768743A313030253B223E0A3C74723E0A3C74643E0A090A093C212D2D204D41494E205449544C45202D2D3E0A093C7461626C6520636C6173733D226D61696E7469746C65222077696474683D313030253E0A09093C74723E0A0909093C74643E3C696D67207372633D2269636F6E2E706E67222077696474683D3130303E3C2F74643E200A0909093C74642077696474683D313030253E3C623E4D494E4944415050533C2F623E3C62723E0A0909093C646976207374796C653D22666F6E742D73697A653A31323B223E0A090909266E6273703B266E6273703B266E6273703B266E6273703B266E6273703B266E6273703B0A090909266E6273703B266E6273703B266E6273703B266E6273703B266E6273703B266E6273703B0A090909266E6273703B266E6273703B266E6273703B0A090909506F7765726564206279204D696E696D613C2F6469763E0A0909093C2F74643E200A0909093C74643E3C696D67207372633D2269636F6E2E706E67222077696474683D3130303E3C2F74643E090A09093C2F74723E0A093C2F7461626C653E0A090A3C2F74643E0A3C2F74723E0A0A3C74723E0A093C74642077696474683D31303025206865696768743D3130302520636C6173733D226D696E69646170706C697374223E0A09092323232323230A093C2F74643E0A3C2F74723E0A0A3C74723E0A093C74643E0A0A093C7461626C6520636C6173733D226D61696E666F6F746572222077696474683D3130302520626F726465723D303E0A09093C74723E0A0909093C74642077696474683D313530207374796C653D22746578742D616C69676E3A6C6566743B223E200A090909093C627574746F6E20636C6173733D22696E7374616C6C6461707022206F6E636C69636B3D2277696E646F772E6C6F636174696F6E2E687265663D2768656C702E68746D6C273B223E48454C503C2F627574746F6E3E200A0909093C2F74643E0A0909090A0909093C7464207374796C653D22746578742D616C69676E3A63656E7465723B666F6E742D73697A653A323422").getData();
	//2000 - 2913
	HEXDATA[2] = new MiniData("0x206E6F777261703E0A0909090909546865203C7370616E207374796C653D22636F6C6F723A23303030223E453C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23323232223E763C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23343434223E6F3C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23363636223E6C3C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23383838223E753C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23616161223E743C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23363636223E693C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23646464223E6F3C2F7370616E3E3C7370616E207374796C653D22636F6C6F723A23666666223E6E3C2F7370616E3E203C212D2D2077696C6C203C623E6E6F743C2F623E2062652043656E7472616C697365642E2E202D2D3E0A0909093C2F74643E0A0909090A0909093C74642077696474683D313530207374796C653D22746578742D616C69676E3A72696768743B22206E6F777261703E200A090909093C627574746F6E20636C6173733D22696E7374616C6C6461707022206F6E636C69636B3D22696E7374616C6C4441505028293B223E494E5354414C4C3C2F627574746F6E3E20090A0909093C2F74643E0A09093C2F74723E0A093C2F7461626C653E0A090A3C2F74643E0A3C2F74723E0A3C2F7461626C653E0A0A3C212D2D205468652061637475616C20666F726D2074686174206973207573656420746F2075706C6F6164206D696E696461707073202D2D3E0A3C666F726D20656E63747970653D226D756C7469706172742F666F726D2D64617461222069643D22696E7374616C6C666F726D2220616374696F6E3D22696E7374616C6C646170702E68746D6C22206D6574686F643D22706F737422207374796C653D22646973706C61793A6E6F6E653B223E0A202020203C212D2D205573656420746F206F70656E207468652073656C6563742046696C65204469616C6F672E2E202D2D3E0A093C696E707574206163636570743D222E6D696E6964617070222069643D2266696C652D696E707574222076616C75653D226E6F66696C652220747970653D2266696C6522206E616D653D226D696E696461707022207374796C653D22646973706C61793A6E6F6E653B22202F3E200A3C2F666F726D3E0A0A0A3C2F626F64793E0A0A3C2F68746D6C3E").getData();
	}

			public static byte[] returnData() throws IOException {
				if(FINAL_ARRAY == null) {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					for(int i=0;i<HEXNUM;i++) {
						baos.write(HEXDATA[i]);
					}
					baos.flush();
					FINAL_ARRAY = baos.toByteArray();	
				}
			    return FINAL_ARRAY;
			}
}
