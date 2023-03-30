package kr.aichemist.aichemist_webgl_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/details")
    public String details(){

        return "details";
    }

    @GetMapping("/browse")
    public String browse(){

        return "browse";
    }

    @GetMapping("/streams")
    public String streams(){

        return "streams";
    }

    @GetMapping("/profile")
    public String profile(){

        return "profile";
    }
}
