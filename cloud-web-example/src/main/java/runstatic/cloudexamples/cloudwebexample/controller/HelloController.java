package runstatic.cloudexamples.cloudwebexample.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author chenmoand
 */
@RestController
@RequestMapping(path = "hello")
public class HelloController {

    @GetMapping("test/{txt}")
    public String hello(@PathVariable String txt, @RequestParam("param") String param) {
        return String.format("Hello txt: %s param: %s", txt, param);
    }


}
