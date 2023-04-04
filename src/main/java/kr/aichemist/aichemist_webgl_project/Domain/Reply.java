package kr.aichemist.aichemist_webgl_project.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Reply {

    @Id
    @Column(name="reply_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    private String content;
    private String createdBy;
    private LocalDateTime regTime;



}
