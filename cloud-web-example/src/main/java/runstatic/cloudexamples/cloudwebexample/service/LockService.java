package runstatic.cloudexamples.cloudwebexample.service;

import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.framework.recipes.locks.InterProcessReadWriteLock;

/**
 * @author chenmoand
 */
public interface LockService {

    InterProcessMutex getLock(String path);

    InterProcessReadWriteLock getReadWriteLock(String path);

}
