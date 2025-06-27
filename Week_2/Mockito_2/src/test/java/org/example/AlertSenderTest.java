package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlertSenderTest {
    @Test
    void testSendAlertCalledWithCorrectMessage() {
        NotificationGateway mockGateway = mock(NotificationGateway.class);
        AlertSender sender = new AlertSender(mockGateway);
        sender.triggerAlert();
        verify(mockGateway).sendAlert("High Temperature Detected");
    }

}