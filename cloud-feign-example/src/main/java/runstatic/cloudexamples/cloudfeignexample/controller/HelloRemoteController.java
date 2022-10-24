package runstatic.cloudexamples.cloudfeignexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(path = "test/{txt}")
    public String hello(@PathVariable String txt, @RequestParam("param") String param) {
        return String.format("[%s] %s", applicationName, helloClient.hello(txt, param));
    }


    @GetMapping(path = "lock/{txt}")
    public String helloLock(@PathVariable String txt) throws Exception {
        return String.format("[%s] %s", applicationName, helloClient.helloLock(txt));
    }


}
