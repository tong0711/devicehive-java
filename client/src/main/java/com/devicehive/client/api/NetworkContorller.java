package com.devicehive.client.api;


import com.devicehive.client.model.Network;

import java.util.List;

public interface NetworkContorller {

    //network block
    List<Network> listNetworks(String name, String namePattern, String sortField, String sortOrder, Integer take,
                               Integer skip);

    Network getNetwork(long id);

    long insertNetwork(Network network);

    void updateNetwork(long id, Network network);

    void deleteNetwork(long id);
}
