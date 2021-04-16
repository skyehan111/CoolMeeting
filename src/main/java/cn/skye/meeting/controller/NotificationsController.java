package cn.skye.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificationsController {

    @GetMapping("/notifications")
    public String notifications(){
        return "notifications";
    }
}
