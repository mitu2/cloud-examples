package runstatic.cloudexamples.cloudreactive2webexample.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author chenmoand
 */
@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;


}
