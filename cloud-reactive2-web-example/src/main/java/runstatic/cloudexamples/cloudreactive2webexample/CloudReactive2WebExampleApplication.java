package runstatic.cloudexamples.cloudreactive2webexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EntityScan(basePackages = "runstatic.cloudexamples.cloudreactive2webexample.entity")
@EnableR2dbcRepositories(basePackages = "runstatic.cloudexamples.cloudreactive2webexample.repositories")
public class CloudReactive2WebExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudReactive2WebExampleApplication.class, args);
    }

}
