package com.example.SpringTeam.Springboot.Project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    method 1
//    @RequestMapping(value = "/", method = RequestMethod.GET)

//    method 2
    @GetMapping("/")
    public String testCont(){
        return "This is my first spring project. only for test 12345.";
    }
}
