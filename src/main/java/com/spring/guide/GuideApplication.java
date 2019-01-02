package com.spring.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GuideApplication {

    @RequestMapping("/")
    public String home() {
        return "Home Page";
    }

    public static void main(String[] args) {
        SpringApplication.run(GuideApplication.class, args);
    }

}

