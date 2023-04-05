package kr.aichemist.aichemist_webgl_project.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Reply extends BaseTimeEntity{

    @Id
    @Column(name="reply_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    private String content;
    @CreatedBy
    private String createdBy;

}
