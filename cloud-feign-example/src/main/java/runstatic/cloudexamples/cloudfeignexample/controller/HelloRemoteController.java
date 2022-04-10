package runstatic.cloudexamples.cloudfeignexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import runstatic.cloudexamples.cloudfeignexample.client.HelloClient;

/**
 * @author chenmoand
 */
@RestController
@RequestMapping("hello")
@RequiredArgsConstructor
public class HelloRemoteController {

    private final HelloClient helloClient;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(path = "test/{txt}")
    public String hello(@PathVariable String txt, @RequestParam("param") String param) {
        return String.format("[%s] %s", applicationName, helloClient.hello(txt, param));
    }


}
