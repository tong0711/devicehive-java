package com.devicehive.client.model;

import com.devicehive.client.json.strategies.JsonPolicyDef;

import java.util.Set;

import static com.devicehive.client.json.strategies.JsonPolicyDef.Policy.*;

public class Device implements HiveEntity {

    private static final long serialVersionUID = -7498444232044147881L;
    @JsonPolicyDef({DEVICE_PUBLISHED, NETWORK_PUBLISHED})
    private String id;
    @JsonPolicyDef({DEVICE_SUBMITTED, DEVICE_PUBLISHED})
    private NullableWrapper<String> key;
    @JsonPolicyDef({DEVICE_PUBLISHED, DEVICE_SUBMITTED, NETWORK_PUBLISHED})
    private NullableWrapper<String> name;
    @JsonPolicyDef({DEVICE_PUBLISHED, DEVICE_SUBMITTED, NETWORK_PUBLISHED})
    private NullableWrapper<String> status;
    @JsonPolicyDef({DEVICE_PUBLISHED, DEVICE_SUBMITTED, NETWORK_PUBLISHED})
    private NullableWrapper<JsonStringWrapper> data;
    @JsonPolicyDef({DEVICE_PUBLISHED, DEVICE_SUBMITTED})
    private NullableWrapper<Network> network;
    @JsonPolicyDef({DEVICE_PUBLISHED, DEVICE_SUBMITTED, NETWORK_PUBLISHED})
    private NullableWrapper<DeviceClass> deviceClass;
    @JsonPolicyDef(DEVICE_PUBLISHED)
    private NullableWrapper<Set<Equipment>> equipment;

    public Device() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return NullableWrapper.value(key);
    }

    public void setKey(String key) {
        this.key = NullableWrapper.create(key);
    }

    public void removeKey() {
        this.key = null;
    }

    public String getName() {
        return NullableWrapper.value(name);
    }

    public void setName(String name) {
        this.name = NullableWrapper.create(name);
    }

    public void removeName() {
        this.name = null;
    }

    public String getStatus() {
        return NullableWrapper.value(status);
    }

    public void setStatus(String status) {
        this.status = NullableWrapper.create(status);
    }

    public void removeStatus() {
        this.status = null;
    }

    public JsonStringWrapper getData() {
        return NullableWrapper.value(data);
    }

    public void setData(JsonStringWrapper data) {
        this.data = NullableWrapper.create(data);
    }

    public void removeData() {
        this.data = null;
    }

    public Network getNetwork() {
        return NullableWrapper.value(network);
    }

    public void setNetwork(Network network) {
        this.network = NullableWrapper.create(network);
    }

    public void removeNetwork() {
        this.network = null;
    }

    public DeviceClass getDeviceClass() {
        return NullableWrapper.value(deviceClass);
    }

    public void setDeviceClass(DeviceClass deviceClass) {
        this.deviceClass = NullableWrapper.create(deviceClass);
    }

    public void removeDeviceClass() {
        this.deviceClass = null;
    }

    public Set<Equipment> getEquipment() {
        return NullableWrapper.value(equipment);
    }

    public void setEquipment(Set<Equipment> equipment) {
        this.equipment = NullableWrapper.create(equipment);
    }

    public void removeEquipment() {
        this.equipment = null;
    }
}
