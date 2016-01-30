package info.ernestas.simple.springexample.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticFunctionsService {

    private final static Logger LOGGER = LoggerFactory.getLogger(ArithmeticFunctionsService.class);

    public double add(double firstNumber, double secondNumber) {
        LOGGER.info("add() arguments: {}, {}", firstNumber, secondNumber);
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        LOGGER.info("subtract() arguments: {}, {}", firstNumber, secondNumber);
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        LOGGER.info("multiply() arguments: {}, {}", firstNumber, secondNumber);
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        LOGGER.info("divide() arguments: {}, {}", firstNumber, secondNumber);
        if (secondNumber == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return firstNumber / secondNumber;
    }

}
