package com.demo.elastick.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
 
    @GetMapping("/hello")
    public String hello() {
        String message = "Hello OMAR to AWS Elastic Beanstalk!";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message += " From host: " + ip;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message;
    }
 
}
