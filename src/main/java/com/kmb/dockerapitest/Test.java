package com.kmb.dockerapitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String testApi() {
        return "docker-api-test-again!! + jenkins-githook22";
    }
}
