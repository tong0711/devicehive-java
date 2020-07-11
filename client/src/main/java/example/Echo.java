/*
 *
 *
 *   Echo.java
 *
 *   Copyright (C) 2018 DataArt
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

package example;

import cn.hutool.core.util.RandomUtil;
import com.github.devicehive.client.model.*;
import com.github.devicehive.client.service.Device;

import com.github.devicehive.client.service.DeviceHive;


import org.joda.time.DateTime;

import java.util.ArrayList;

import java.util.List;


public class Echo {
    //DeviceHive settings
    private static final String accessToken = "eyJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7ImEiOlswXSwiZSI6MTU5NDQ0NzAzNjg2MSwidCI6MSwidSI6MSwibiI6WyIqIl0sImR0IjpbIioiXX19.0ByPlY-SV7FQu33ldMx2DiZgiVnfQuRpVrVSZS8Teyc";
    private static final String refreshToken = "eyJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7ImEiOlswXSwiZSI6MTYxMDE3MDAzNjg2MiwidCI6MCwidSI6MSwibiI6WyIqIl0sImR0IjpbIioiXX19.8msfHfdRL8KoNb8n0ii8qzmwEMOwtwuvI4hnaB4hrss";
    private static final String URL = "http://localhost/api/rest";
    private static final String COMMAND_NAME = "echo_command";

    public static void main(String[] args) {
        final DeviceHive deviceHive = DeviceHive.getInstance().init(URL, refreshToken, accessToken);
        final String deviceId = "IOuDBdHnTT7gFCDdHiaKm1BfecZG2JDIPHSE";

        final DHResponse<Device> deviceResponse = deviceHive.getDevice(deviceId);
        if (!deviceResponse.isSuccessful()) {
            System.out.println(deviceResponse);
            return;
        }
        final Device device = deviceResponse.getData();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    List<Parameter> parameters = new ArrayList<>();
                    double t=25;
                    t=t+ RandomUtil.randomDouble(-10,15);

                    Parameter parameter = new Parameter("temp", ""+t);
                    parameters.add(parameter);
                    DHResponse<DeviceNotification>  r=    device.sendNotification("info", parameters);
                    System.out.println("========send result:"+r.getData());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


//        CommandFilter filter = getFilter();
//        deviceHive.subscribeCommands(Collections.singletonList(deviceId), filter, new DeviceCommandsCallback() {
//            @Override
//            public void onSuccess(List<DeviceCommand> commands) {
//                System.out.println("echo");
//                deviceHive.removeDevice(deviceId);
//                Runtime.getRuntime().exit(200);
//            }
//
//            @Override
//            public void onFail(FailureData failureData) {
//                System.out.println(failureData);
//            }
//        });
//        device.sendCommand(COMMAND_NAME, null);
    }

    private static CommandFilter getFilter() {
        CommandFilter filter = new CommandFilter();
        filter.setCommandNames(COMMAND_NAME);
        filter.setStartTimestamp(DateTime.now().minusMinutes(1));
        return filter;
    }
}
