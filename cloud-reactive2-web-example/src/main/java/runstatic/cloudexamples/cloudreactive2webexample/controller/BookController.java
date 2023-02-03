package runstatic.cloudexamples.cloudreactive2webexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import runstatic.cloudexamples.cloudreactive2webexample.entity.Book;
import runstatic.cloudexamples.cloudreactive2webexample.repositories.BookRepository;

/**
 * @author chenmoand
 */
@RestController
@RequestMapping(path = "book")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class BookController {

    private final BookRepository bookRepository;

    @PostMapping
    public Mono<Book> addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    public Mono<Page<Book>> getBooks(@ModelAttribute Book book, @SortDefault Sort sort, @PageableDefault Pageable pageable) {
        return bookRepository.findBy(Example.of(book), query -> query.sortBy(sort)
                .page(pageable));
    }

}
