package com.example.calculator.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorWebController {

    @GetMapping("/calculator")
    public String showCalculator(){
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam int a,
            @RequestParam int b,
            @RequestParam String operation,
            Model model ) {

        int result = 0;

        switch (operation){
            case "add":
                result = a + b;
                break;

            case "sub":
                result = a - b;
                break;

            case "mul":
                result = a * b;
                break;

            case "div":
                result = (b != 0) ? (a / b) : 0;
                break;
        }

        model.addAttribute("result", result);
        return "calculator";
    }
}
