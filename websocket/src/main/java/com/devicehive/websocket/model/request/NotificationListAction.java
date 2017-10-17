/*
 *
 *
 *   NotificationListAction.java
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

package com.devicehive.websocket.model.request;

import com.devicehive.websocket.model.SortOrder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.joda.time.DateTime;

import static com.devicehive.websocket.model.ActionConstant.NOTIFICATION_LIST;

@Data
public class NotificationListAction extends RequestAction {

    @SerializedName("deviceId")
    private String deviceId;
    @SerializedName("start")
    private DateTime start;
    @SerializedName("end")
    private DateTime end;
    @SerializedName("notification")
    private String notification;
    @SerializedName("sortField")
    private String sortField;
    @SerializedName("sortOrder")
    private SortOrder sortOrder;
    @SerializedName("take")
    private Integer take;
    @SerializedName("skip")
    private Integer skip;

    public NotificationListAction() {
        super(NOTIFICATION_LIST);
    }
}