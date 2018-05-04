package com.example.gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test gradle
 * @author liutong
 */
@RestController
public class IndexController {

    @GetMapping("")
    public String index(){
        System.out.println("*********welcome to gradle test**********");
        return "welcome to gradle test";
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        System.out.println("*********say hello**********");
        return "hello";
    }

}
