package jms._9_spring_jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringJMSApplicationTests {

    @Autowired
    MessageSender sender;

    @Test
    public void testSendAndReceive() {
        sender.send("Hello Spring JMS!");
    }

}
