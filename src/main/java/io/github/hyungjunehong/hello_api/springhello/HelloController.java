package io.github.hyungjunehong.hello_api.springhello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Welcome to Spring Hello API!";
    }
    @GetMapping("/hello")
    public HelloResponse hello() {
        var nowSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        return new HelloResponse(
                nowSeoul.toString(),
                System.currentTimeMillis(),
                "Hello, World!"
        );
    }
}