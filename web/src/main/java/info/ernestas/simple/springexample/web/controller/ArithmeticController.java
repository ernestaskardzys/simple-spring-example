package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.services.ArithmeticFunctionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/arithmetic")
public class ArithmeticController {

    @Autowired
    private ArithmeticFunctionsService arithmeticFunctionsService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String calculateAllResults(Model model, @RequestParam("first") double firstNumber, @RequestParam("second") double secondNumber) {
        model.addAttribute("sum", arithmeticFunctionsService.add(firstNumber, secondNumber));
        model.addAttribute("subtract", arithmeticFunctionsService.subtract(firstNumber, secondNumber));
        model.addAttribute("multiply", arithmeticFunctionsService.multiply(firstNumber, secondNumber));
        model.addAttribute("divide", arithmeticFunctionsService.divide(firstNumber, secondNumber));
        return "arithmetic";
    }

}
