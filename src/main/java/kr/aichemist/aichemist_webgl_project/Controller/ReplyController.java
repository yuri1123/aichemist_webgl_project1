package kr.aichemist.aichemist_webgl_project.Controller;

import jakarta.validation.Valid;
import kr.aichemist.aichemist_webgl_project.Domain.Reply;
import kr.aichemist.aichemist_webgl_project.Domain.ReplyFormDto;
import kr.aichemist.aichemist_webgl_project.repository.ReplyRepository;
import kr.aichemist.aichemist_webgl_project.service.ReplyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReplyController {

    @Autowired
    private ReplyService replyService;
    //댓글 등록하기
    @PostMapping ("create/reply")
    String createReply(@Valid ReplyFormDto replyFormDto,
                       BindingResult bindingResult,
                       Model model){

            //상품 저장 로직을 호출한다. 매개변수로 상품정보와 상품 이미지 정보를 담고있는 itemImgFileList 넘겨줌
        replyService.createReply(replyFormDto);
        return "redirect:/";
    }

    }




