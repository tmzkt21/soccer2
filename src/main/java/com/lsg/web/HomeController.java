package com.lsg.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String hello() {

        return "반갑다 스트링부트!!";
    }


}
