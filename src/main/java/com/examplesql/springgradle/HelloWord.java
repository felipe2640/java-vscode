package com.examplesql.springgradle;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/")

public class HelloWord {

    // @PostMapping
    // @PutMapping
    // @PatchMapping
    @GetMapping
    public String sayHello() {
        return "Hello from SpringBoot test";

    }

    /*
     * @GetMapping("/subpath")
     * public String subPath(@RequestParam("name") String name) {
     * //Solicita uma query String
     * return "This a subPath /" + name;
     * }
     */
    /*
     * @PostMapping("/post")
     * public String sayHelloPost(@ResponseBody Map<String, Object> payload) {
     * return payload.get("name").toString();
     * }
     */

    @GetMapping("/subpath")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String subPath(final WebRequest webRequest) {
        // Solicita uma query String
        String name = webRequest.getParameter("name");
        if (name != null) {
            return "This a subPath /" + name;
        }
        return "No query params";
    }

    @GetMapping("/{dynamic}")
    public String dynamicSubPath(@PathVariable("dynamic") String name) {
        return "Hello " + name + " this is my route dynamic...";
    }

}
