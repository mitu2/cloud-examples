package runstatic.cloudexamples.cloudwebexample.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author chenmoand
 */
@Data
public class Message {

    @Id
    private Long id;
    private String content;
    @Column(name = "create_time")
    private LocalDateTime createTime;
    @Column(name = "update_time")
    private LocalDateTime updateTime;

}
