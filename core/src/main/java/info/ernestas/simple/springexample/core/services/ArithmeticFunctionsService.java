package info.ernestas.simple.springexample.core.services;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticFunctionsService {

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return firstNumber / secondNumber;
    }

}
