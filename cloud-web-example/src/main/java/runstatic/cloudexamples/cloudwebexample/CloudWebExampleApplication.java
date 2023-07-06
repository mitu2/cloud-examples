package runstatic.cloudexamples.cloudwebexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import runstatic.cloudexamples.cloudwebexample.mapper.MessageMapper;

/**
 * @author chenmoand
 */
@SpringBootApplication
@MapperScan("runstatic.cloudexamples.cloudwebexample.mapper")
public class CloudWebExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudWebExampleApplication.class, args);
    }

}
