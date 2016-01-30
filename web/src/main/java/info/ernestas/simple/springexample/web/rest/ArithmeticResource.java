package info.ernestas.simple.springexample.web.rest;

import info.ernestas.simple.springexample.core.service.ArithmeticFunctionsService;
import info.ernestas.simple.springexample.web.model.ArithmeticResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/arithmetic")
public class ArithmeticResource {

    @Autowired
    private ArithmeticFunctionsService arithmeticFunctionsService;

    @RequestMapping("/all")
    public @ResponseBody ArithmeticResponse calculateAllResults(@RequestParam("first") double firstNumber, @RequestParam("second") double secondNumber) {
        ArithmeticResponse arithmeticResponse = new ArithmeticResponse();
        arithmeticResponse.setSumResult(arithmeticFunctionsService.add(firstNumber, secondNumber));
        arithmeticResponse.setSubtractionResult(arithmeticFunctionsService.subtract(firstNumber, secondNumber));
        arithmeticResponse.setMultiplicationResult(arithmeticFunctionsService.multiply(firstNumber, secondNumber));
        arithmeticResponse.setDivisionResult(arithmeticFunctionsService.divide(firstNumber, secondNumber));

        return arithmeticResponse;
    }

}
