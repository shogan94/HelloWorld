package com.clearavenue.helloworld;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class HelloWorldController {

    @GetMapping("/version")
    public String getVersion(){
        log.info("HelloWorld Getting Version");
        return "1.0.0";
    }

    @GetMapping("/hello")
    public String hello(){
        log.info("Hello");
        return "World";
    }
}
