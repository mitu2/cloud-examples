package runstatic.cloudexamples.cloudoauth2client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author chenmoand
 */
public class RandomTest {

    @Test
    public void doTest() {
        new A("2");
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class A {

        String a;

        {
            System.out.println(1);
        }

    }
}
