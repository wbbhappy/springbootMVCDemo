package com.spboot.mvcdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloMVCController {

    @RequestMapping("/mvc")
    public String Hello(){
        return "hello";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}
