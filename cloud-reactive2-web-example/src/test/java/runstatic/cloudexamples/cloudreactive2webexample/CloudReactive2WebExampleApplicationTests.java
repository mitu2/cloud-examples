package runstatic.cloudexamples.cloudreactive2webexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import runstatic.cloudexamples.cloudreactive2webexample.repositories.LeaveMessageRepository;

@SpringBootTest
class CloudReactive2WebExampleApplicationTests {

    @Autowired
    private LeaveMessageRepository leaveMessageRepository;

    @Test
    void contextLoads() {
        System.out.println(leaveMessageRepository.findAll().blockFirst());
    }

}
