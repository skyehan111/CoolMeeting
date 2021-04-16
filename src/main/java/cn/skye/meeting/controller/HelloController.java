package cn.skye.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("hello","hello,skye" );
        return "hello";
    }
}
