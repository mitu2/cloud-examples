package runstatic.cloudexamples.cloudreactive2webexample.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * @author chenmoand
 */
@Entity
@Table(name = "user")
@Data
@Comment("用户表")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Comment("用户名")
    private String name;

    @Column
    @Comment("头像")
    private String avatarUrl;

    @Column
    @Comment("博客地址")
    private String blog;

    @Column
    @Comment("邮箱地址")
    private String email;

    @Column
    @Comment("通过Oauth2注册的关联ID")
    private String registerSourceId;

    @Column(length = 80)
    @Comment("通过Oauth2注册的关联类型")
    private String registerSource;

    @Column
    @CreatedDate
    private LocalDateTime createDate;

    @Column
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


}
