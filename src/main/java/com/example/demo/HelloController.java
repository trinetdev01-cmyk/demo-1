package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {


    @GetMapping("/test")
    public String test() {
        log.info("★★★ ログ出力のテストに成功しました ★★★");
        return "Spring Boot 起動成功！";
    }
}