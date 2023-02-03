package runstatic.cloudexamples.cloudreactive2webexample.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import runstatic.cloudexamples.cloudreactive2webexample.entity.Book;

/**
 * @author chenmoand
 */
@Repository
public interface BookRepository extends R2dbcRepository<Book, Long> {
}
