package com.proyectos.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {

    @GetMapping("/")
    public String ShowCalculator(){
        return "calculator";
    }

    @PostMapping("/calculate")
    public String Calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operator") String operator,
                            Model model){
        double result;
        switch (operator) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operator);
        }
        model.addAttribute("result", result);
        return "calculator";
        
    }
}