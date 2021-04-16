package jms._8_MDBs;

import lombok.SneakyThrows;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "MyMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/FromSellSide"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-Acknowledge")
})
public class MDB implements MessageListener {

    @SneakyThrows
    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            String text = ((TextMessage) message).getText();
            System.out.println("Received message: " + text);
        }
    }
}
