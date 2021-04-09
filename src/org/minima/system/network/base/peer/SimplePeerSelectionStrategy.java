/*
 * Copyright 2020 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.minima.system.network.base.peer;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;
//import static tech.pegasys.teku.networking.p2p.connection.PeerPools.PeerPool.STATIC;
import static org.minima.system.network.base.peer.PeerPools.PeerPool.STATIC;

import java.util.List;
import java.util.function.Supplier;
// import tech.pegasys.teku.networking.p2p.connection.PeerPools;
// import tech.pegasys.teku.networking.p2p.connection.PeerSelectionStrategy;
// import tech.pegasys.teku.networking.p2p.connection.TargetPeerRange;
// import tech.pegasys.teku.networking.p2p.discovery.DiscoveryPeer;
// import tech.pegasys.teku.networking.p2p.network.P2PNetwork;
// import tech.pegasys.teku.networking.p2p.network.PeerAddress;
// import tech.pegasys.teku.networking.p2p.peer.Peer;

//import org.minima.system.network.base.;

import org.minima.system.network.base.P2PNetwork;
import org.minima.system.network.base.DiscoveryPeer;

public class SimplePeerSelectionStrategy implements PeerSelectionStrategy {
  private final TargetPeerRange targetPeerRange;

  public SimplePeerSelectionStrategy(final TargetPeerRange targetPeerRange) {
    this.targetPeerRange = targetPeerRange;
  }

  @Override
  public List<PeerAddress> selectPeersToConnect(
      final P2PNetwork<?> network,
      final PeerPools peerPools,
      final Supplier<List<DiscoveryPeer>> candidates) {
    final int peersToAdd = targetPeerRange.getPeersToAdd(network.getPeerCount());
    if (peersToAdd == 0) {
      return emptyList();
    }
    return candidates.get().stream()
        .map(network::createPeerAddress)
        .limit(peersToAdd)
        .collect(toList());
  }

  @Override
  public List<Peer> selectPeersToDisconnect(
      final P2PNetwork<?> network, final PeerPools peerPools) {
    final int peersToDrop = targetPeerRange.getPeersToDrop(network.getPeerCount());
    return network
        .streamPeers()
        .filter(peer -> peerPools.getPool(peer.getId()) != STATIC)
        .limit(peersToDrop)
        .collect(toList());
  }
}
