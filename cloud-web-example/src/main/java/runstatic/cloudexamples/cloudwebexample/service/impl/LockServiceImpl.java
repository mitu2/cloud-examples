package runstatic.cloudexamples.cloudwebexample.service.impl;

import lombok.RequiredArgsConstructor;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import runstatic.cloudexamples.cloudwebexample.service.LockService;

/**
 * @author chenmoand
 */
@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class LockServiceImpl implements LockService {

    private final CuratorFramework framework;
    private final String BASE_PATH = "/lock/";

    @Override
    public InterProcessMutex getLock(String path) {
        Assert.hasText(path, "path must not be blank");
        return new InterProcessMutex(framework, BASE_PATH + path);
    }

    @Override
    public InterProcessReadWriteLock getReadWriteLock(String path) {
        Assert.hasText(path, "path must not be blank");
        return new InterProcessReadWriteLock(framework, BASE_PATH + path);
    }

}
