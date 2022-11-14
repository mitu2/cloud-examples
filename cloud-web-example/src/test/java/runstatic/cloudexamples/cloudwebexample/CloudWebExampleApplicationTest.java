package runstatic.cloudexamples.cloudwebexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import runstatic.cloudexamples.cloudwebexample.mapper.MessageMapper;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author chenmoand
 */
@SpringBootTest
class CloudWebExampleApplicationTest {

    @Autowired
    private MessageMapper mapper;

    @Test
    void testMessageMapper() {
        mapper.queryAllDesc("create_time");
    }

}