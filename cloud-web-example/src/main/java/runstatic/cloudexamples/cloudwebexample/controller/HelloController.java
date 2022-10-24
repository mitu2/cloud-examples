package runstatic.cloudexamples.cloudwebexample.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;
import runstatic.cloudexamples.cloudwebexample.service.LockService;

import java.util.concurrent.TimeUnit;

/**
 * @author chenmoand
 */
@RestController
@RequestMapping(path = "hello")
@Slf4j
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class HelloController {

    private final LockService lockService;

    @GetMapping("test/{txt}")
    public String hello(@PathVariable String txt, @RequestParam("param") String param) {
        return String.format("Hello txt: %s param: %s", txt, param);
    }

    @GetMapping("lock/{txt}")
    public String helloLock(@PathVariable String txt) throws Exception {
        InterProcessMutex lock = lockService.getLock("HelloController/helloLock");
        StopWatch stopWatch = new StopWatch("helloLock");
        try {
            stopWatch.start();
            lock.acquire();
            TimeUnit.SECONDS.sleep(10L);
            stopWatch.stop();
            return String.format("lock Hello txt: %s, watch: %s", txt, stopWatch);
        } finally {
            lock.release();
        }
    }

}
