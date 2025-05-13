package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DockerDemoController {

    @PostMapping("/test")
    public String placeOrder() {
        log.info("start .... placeOrder");
        return "test Done";
    }

}
