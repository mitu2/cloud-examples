package runstatic.cloudexamples.cloudkafkaexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenmoand
 */
@Slf4j
@SpringBootApplication
// @EnableKafkaStreams
public class CloudKafkaExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(CloudKafkaExampleApplication.class, args);
    }

}