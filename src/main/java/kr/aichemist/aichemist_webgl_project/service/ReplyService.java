package kr.aichemist.aichemist_webgl_project.service;

import kr.aichemist.aichemist_webgl_project.domain.Reply;
import kr.aichemist.aichemist_webgl_project.domain.ReplyFormDto;
import kr.aichemist.aichemist_webgl_project.repository.ReplyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
    @Autowired
    private ReplyRepository replyrepository;
    @Autowired
    private ModelMapper modelMapper;

    public void createReply(ReplyFormDto replyFormDto) {
        Reply reply = modelMapper.map(replyFormDto, Reply.class);
        replyrepository.save(reply);
    }

    public List<Reply> selectAll(){
        List<Reply> replyList = replyrepository.selectAll();
        return replyList;
    }
}
