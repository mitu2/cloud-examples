package runstatic.cloudexamples.cloudreactive2webexample.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author chenmoand
 */
@Entity
@Table(name = "leave_message")
@Data
public class LeaveMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long parentId;

    @Column(length = 3000)
    private String content;

    @Transient
    @CreatedBy
    @Column
    @ToString.Exclude
    private User createBy;

    @Column
    @CreatedDate
    private LocalDateTime createDate;

    @Column
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @Column
    @Version
    private Integer version;


    @Transient
    @ToString.Exclude
    @OneToMany(mappedBy = "parentId", targetEntity = LeaveMessage.class)
    private transient List<LeaveMessage> childLeaveMessage;


}
