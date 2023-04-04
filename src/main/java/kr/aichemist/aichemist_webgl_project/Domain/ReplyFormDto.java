package kr.aichemist.aichemist_webgl_project.Domain;

import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReplyFormDto {


    private Long id;
    @Lob
    private String content;
    private String createdBy;
    private LocalDateTime regTime;

    private static ModelMapper modelMapper = new ModelMapper();
    public static ReplyFormDto of(Reply reply){
        return modelMapper.map(reply, ReplyFormDto.class);
    }

}
