package com.springboot;

/**
 * Created by fww on 2017/5/1.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
    @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "text/html")
    public String hello() {
        return "Hello spring boot!";
    }
}
