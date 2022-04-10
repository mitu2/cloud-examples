package runstatic.cloudexamples.cloudfeignexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenmoand
 */
@SpringBootApplication
@EnableFeignClients
public class CloudFeignExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignExampleApplication.class, args);
    }

}
