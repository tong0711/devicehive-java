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


package com.devicehive.rest.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.joda.time.DateTime;

/**
 * DeviceNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-20T15:03:42.016+03:00")
@Data
public class DeviceNotification implements Comparable<DeviceNotification> {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("notification")
    private String notification = null;

    @SerializedName("deviceId")
    private String deviceId = null;

    @SerializedName("timestamp")
    private DateTime timestamp = null;

    @SerializedName("parameters")
    private JsonStringWrapper parameters = null;

    @Override
    public String toString() {
        return "{\n\"DeviceNotification\":{\n"
                + "\"id\":\"" + id + "\""
                + ",\n \"notification\":\"" + notification + "\""
                + ",\n \"deviceId\":\"" + deviceId + "\""
                + ",\n \"timestamp\":" + timestamp
                + ",\n \"parameters\":" + parameters
                + "}\n}";
    }

    @Override
    public int compareTo(DeviceNotification notification) {
        return getTimestamp().compareTo(notification.getTimestamp());
    }

}

