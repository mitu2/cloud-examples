package runstatic.cloudexamples.cloudfeignexample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenmoand
 */
@Component
@FeignClient(name = "cloud-web-example", path = "hello")
public interface HelloClient {

    @GetMapping(path = "test/{txt}")
    String hello(@PathVariable String txt, @RequestParam("param") String param);

    @GetMapping(path = "lock/{txt}")
    String helloLock(@PathVariable String txt) throws Exception;

}
