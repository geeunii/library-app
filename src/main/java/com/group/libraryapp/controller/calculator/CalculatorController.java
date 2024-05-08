package com.group.libraryapp.controller.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add") //Get /add
    public int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
