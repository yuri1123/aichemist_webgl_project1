package kr.aichemist.aichemist_webgl_project.service;

import kr.aichemist.aichemist_webgl_project.Domain.Reply;
import kr.aichemist.aichemist_webgl_project.Domain.ReplyFormDto;
import kr.aichemist.aichemist_webgl_project.repository.ReplyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {
    @Autowired
    private ReplyRepository replyrepository;
    private ModelMapper modelMapper;

    public void createReply(ReplyFormDto replyFormDto) {
        Reply reply = modelMapper.map(replyFormDto, Reply.class);
        replyrepository.save(reply);
    }
}
