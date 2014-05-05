package com.devicehive.messages.subscriptions;

import java.util.Set;
import java.util.UUID;

public class CommandSubscriptionStorage extends AbstractStorage<Long, CommandSubscription> {

    public Set<CommandSubscription> getByDeviceId(Long id) {
        return get(id);
    }



    public Set<CommandSubscription> getBySession(String sessionId) {
        return get(sessionId);
    }

    public synchronized void removeByDevice(Long deviceId) {
        removeByEventSource(deviceId);
    }

}
