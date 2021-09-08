package com.minchul.springdeploy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public String home() {
        log.info("--------- Request ---------");
        return "Hello!!";
    }
}
