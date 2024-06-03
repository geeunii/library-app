package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorRequest;
import com.group.libraryapp.dto.calculator.response.CalculatorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add") //Get /add
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @GetMapping("/api/v1/calc") //Get /api/v1/calc
    public CalculatorResponse calculatorResponse(CalculatorRequest request) {
        return new CalculatorResponse(request);
    }
}

