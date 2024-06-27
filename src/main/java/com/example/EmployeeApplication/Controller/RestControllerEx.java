package com.example.EmployeeApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class RestControllerEx {
    @GetMapping("/")
    public String get()
    {
        System.out.println("Nagateja");
        return "hello world";
    }
}
