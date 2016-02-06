package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.service.ArithmeticFunctionsService;
import info.ernestas.simple.springexample.web.model.ArithmeticForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/arithmetic")
public class ArithmeticController {

    @Autowired
    private ArithmeticFunctionsService arithmeticFunctionsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultArithmeticPage(Model model) {
        model.addAttribute("form", new ArithmeticForm());
        return "arithmetic";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String calculateAllResults(Model model, @ModelAttribute("form") ArithmeticForm form) {
        double firstNumber = form.getFirstNumber();
        double secondNumber = form.getSecondNumber();

        model.addAttribute("sum", arithmeticFunctionsService.add(firstNumber, secondNumber));
        model.addAttribute("subtract", arithmeticFunctionsService.subtract(firstNumber, secondNumber));
        model.addAttribute("multiply", arithmeticFunctionsService.multiply(firstNumber, secondNumber));
        model.addAttribute("divide", arithmeticFunctionsService.divide(firstNumber, secondNumber));

        return "arithmeticResults";
    }

}
