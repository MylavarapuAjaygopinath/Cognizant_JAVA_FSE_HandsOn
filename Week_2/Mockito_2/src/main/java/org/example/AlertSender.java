package org.example;

public class AlertSender {
    private final NotificationGateway gateway;

    public AlertSender(NotificationGateway gateway) {
        this.gateway = gateway;
    }

    public void triggerAlert() {
        gateway.sendAlert("High Temperature Detected");
    }
}
