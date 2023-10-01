package pro.sky.sky.prospringdemo.service.impl;

import pro.sky.sky.prospringdemo.service.API.CalculatorInterface;

@org.springframework.stereotype.Service

public class Service implements CalculatorInterface {


    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
