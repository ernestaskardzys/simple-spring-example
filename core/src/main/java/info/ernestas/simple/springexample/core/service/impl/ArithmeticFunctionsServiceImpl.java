package info.ernestas.simple.springexample.core.service.impl;

import info.ernestas.simple.springexample.core.service.ArithmeticFunctionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticFunctionsServiceImpl implements ArithmeticFunctionsService {

    private final static Logger LOGGER = LoggerFactory.getLogger(ArithmeticFunctionsServiceImpl.class);

    @Override
    public double add(double firstNumber, double secondNumber) {
        LOGGER.info("add() arguments: {}, {}", firstNumber, secondNumber);
        return firstNumber + secondNumber;
    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        LOGGER.info("subtract() arguments: {}, {}", firstNumber, secondNumber);
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        LOGGER.info("multiply() arguments: {}, {}", firstNumber, secondNumber);
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        LOGGER.info("divide() arguments: {}, {}", firstNumber, secondNumber);
        if (secondNumber == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return firstNumber / secondNumber;
    }

}
