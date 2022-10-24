package runstatic.cloudexamples.cloudkafkaexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

/**
 * @author chenmoand
 */
@Slf4j
@SpringBootApplication
public class CloudKafkaExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(CloudKafkaExampleApplication.class, args);
    }


    @Bean
    public Consumer<String> testKafkaConsumer() {
        return (message) -> {
            log.info("Kafka Message: {}", message);
        };
    }
}