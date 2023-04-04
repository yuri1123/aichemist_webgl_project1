package kr.aichemist.aichemist_webgl_project.Controller;

import kr.aichemist.aichemist_webgl_project.Domain.ReplyFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main(Model model, ReplyFormDto replyFormDto){
        model.addAttribute("replyFormDto", replyFormDto);
        return "index";
    }

}