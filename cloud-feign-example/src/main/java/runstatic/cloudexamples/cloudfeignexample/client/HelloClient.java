package runstatic.cloudexamples.cloudfeignexample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenmoand
 */
@Component
@FeignClient(name = "cloud-web-example")
public interface HelloClient {

    @RequestMapping(path = "hello/test/{txt}")
    String hello(@PathVariable String txt, @RequestParam("param") String param);

}
