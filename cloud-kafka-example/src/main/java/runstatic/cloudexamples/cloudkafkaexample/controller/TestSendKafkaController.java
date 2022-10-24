package runstatic.cloudexamples.cloudkafkaexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author chenmoand
 */
@Slf4j
@RestController
@RequestMapping(path = "test/send")
public class TestSendKafkaController {

    private final StreamBridge bridge;

    public TestSendKafkaController(StreamBridge bridge) {
        this.bridge = bridge;
    }

    @GetMapping
    public Mono<String> send(@RequestParam String value) {
        try {
            bridge.send("testKafkaFunction-out-0", MessageBuilder.withPayload(value).build());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return Mono.just("Success");
    }

}
