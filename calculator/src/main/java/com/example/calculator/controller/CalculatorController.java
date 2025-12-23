package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping("/")
    public String index(){
        return "Welcome to my Spring Boot API! Try accessing /api/your-endpoint";
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @GetMapping("/sub")
    public int subtract(@RequestParam int a, @RequestParam int b){
        return a - b;
    }

    @GetMapping("/mul")
    public int multiply(@RequestParam int a, @RequestParam int b){
        return a * b;
    }

    @GetMapping("/div")
    public String divide(@RequestParam int a, @RequestParam int b){
        if (b == 0){
            return "Division By Zero is Not Allowed";
        }
        return String.valueOf(a / b);
    }
}
