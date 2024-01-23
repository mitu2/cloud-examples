package runstatic.cloudexamples.cloudkafkaexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

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
            Map<String, Object> data = new HashMap<>();
            data.put("id", UUID.randomUUID().toString());
            data.put("value", value);
            bridge.send("exampleKafkaFunction-out-0", MessageBuilder.withPayload(data).build());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return Mono.just("Success");
    }

    @Bean
    public Consumer<Map<String, Object>> exampleKafkaConsumer() {
        return (message) -> {
            log.info("exampleKafkaConsumer message: {}", message);
        };
    }


}
