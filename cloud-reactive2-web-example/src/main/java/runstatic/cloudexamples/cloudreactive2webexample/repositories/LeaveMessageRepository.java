package runstatic.cloudexamples.cloudreactive2webexample.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import runstatic.cloudexamples.cloudreactive2webexample.entity.Book;
import runstatic.cloudexamples.cloudreactive2webexample.entity.LeaveMessage;

/**
 * @author chenmoand
 */
@Repository
public interface LeaveMessageRepository extends R2dbcRepository<LeaveMessage, Long> {


}
