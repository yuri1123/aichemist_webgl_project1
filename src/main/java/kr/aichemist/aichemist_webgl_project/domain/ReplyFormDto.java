package kr.aichemist.aichemist_webgl_project.domain;

import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.data.annotation.CreatedBy;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReplyFormDto {


    private Long id;
    private String createdBy;
    @Lob
    private String content;
    private LocalDateTime regTime;
    private LocalDateTime modifiedTime;

    private static ModelMapper modelMapper = new ModelMapper();
    public static ReplyFormDto of(Reply reply){
        return modelMapper.map(reply, ReplyFormDto.class);
    }

}
