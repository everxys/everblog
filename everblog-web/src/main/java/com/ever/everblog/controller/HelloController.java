package com.ever.everblog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController implements ApplicationListener<ApplicationReadyEvent> {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello,world!";
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("Hello,world!");
    }

}
