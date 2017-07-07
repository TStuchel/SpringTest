package com.daugherty.springtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringTestController {
    
    @RequestMapping(path="/", method=RequestMethod.GET)
    public String getHello() {
        return "Hello, World!";
    }

}
