package info.ernestas.simple.springexample.web.rest;

import info.ernestas.simple.springexample.core.service.ArithmeticFunctionsService;
import info.ernestas.simple.springexample.web.model.ArithmeticResult;
import info.ernestas.simple.springexample.web.model.rest.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/arithmetic")
public class ArithmeticResource {

    @Autowired
    private ArithmeticFunctionsService arithmeticFunctionsService;

    @RequestMapping("/all")
    public JsonResponse<ArithmeticResult> calculateAllResults(@RequestParam("first") double firstNumber, @RequestParam("second") double secondNumber) {
        ArithmeticResult arithmeticResult = new ArithmeticResult();
        arithmeticResult.setSumResult(arithmeticFunctionsService.add(firstNumber, secondNumber));
        arithmeticResult.setSubtractionResult(arithmeticFunctionsService.subtract(firstNumber, secondNumber));
        arithmeticResult.setMultiplicationResult(arithmeticFunctionsService.multiply(firstNumber, secondNumber));
        arithmeticResult.setDivisionResult(arithmeticFunctionsService.divide(firstNumber, secondNumber));

        return new JsonResponse<>(arithmeticResult);
    }

}
