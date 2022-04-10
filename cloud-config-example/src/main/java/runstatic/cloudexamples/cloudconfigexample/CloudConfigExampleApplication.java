package runstatic.cloudexamples.cloudconfigexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chenmoand
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigExampleApplication.class, args);
    }

}
