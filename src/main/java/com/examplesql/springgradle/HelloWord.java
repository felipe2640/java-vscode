package com.examplesql.springgradle;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloWord {

    // @PostMapping
    @GetMapping
    public String sayHello() {
        return "Hello from SpringBoot test";

    }

    @GetMapping("/subpath")
    public String subPath() {
        return "This a subPath";
    }
    // @PutMapping
    // @PatchMapping
}
