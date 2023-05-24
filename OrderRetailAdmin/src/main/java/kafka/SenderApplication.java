package kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SenderApplication implements CommandLineRunner {
    @Autowired
    Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(SenderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // update order status
        OrderUpdation updateDetails = new OrderUpdation(1, 1,OrderStatus.DELIVERED);
        System.out.println("Sending ...");

        ObjectMapper objectMapper = new ObjectMapper();
        String order = objectMapper.writeValueAsString(updateDetails);
        //convert instruction to JSON string

        sender.send("changeOrderStatus2",order);



    }
}
