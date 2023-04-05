package kr.aichemist.aichemist_webgl_project.controller;

import kr.aichemist.aichemist_webgl_project.domain.Reply;
import kr.aichemist.aichemist_webgl_project.domain.ReplyFormDto;
import kr.aichemist.aichemist_webgl_project.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ReplyService replyService;
    @GetMapping("/")
    public String main(Model model, ReplyFormDto replyFormDto){
        model.addAttribute("replyFormDto", replyFormDto);
        List<Reply> replyList = replyService.selectAll();
        model.addAttribute("replyList",replyList);
        return "index";
    }

}