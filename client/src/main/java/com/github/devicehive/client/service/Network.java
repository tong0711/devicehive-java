/*
 *
 *
 *   Network.java
 *
 *   Copyright (C) 2017 DataArt
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

/*
 * Device Hive REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.3.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.devicehive.client.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
public class Network {

    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;

    public void save() throws IOException {
        DeviceHive.getInstance().getNetworkService().updateNetwork(id, name, description);
    }

    static Network create(com.github.devicehive.rest.model.Network network) {
        if (network == null) return null;
        return Network.builder()
                .id(network.getId())
                .name(network.getName())
                .description(network.getDescription())
                .build();
    }

    static Network create(com.github.devicehive.rest.model.NetworkVO network) {
        if (network == null) return null;
        return Network.builder()
                .id(network.getId())
                .name(network.getName())
                .description(network.getDescription())
                .build();
    }

    static List<Network> createList(List<com.github.devicehive.rest.model.Network> list) {
        if (list == null) return null;
        List<Network> result = new ArrayList<Network>(list.size());
        for (com.github.devicehive.rest.model.Network n : list) {
            result.add(create(n));
        }
        return result;
    }

    static List<Network> createListVO(List<com.github.devicehive.rest.model.NetworkVO> list) {
        if (list == null) return null;
        List<Network> result = new ArrayList<Network>(list.size());
        for (com.github.devicehive.rest.model.NetworkVO n : list) {
            result.add(create(n));
        }
        return result;
    }

}
