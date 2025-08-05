package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.example.Calculator;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {


    @ParameterizedTest
    @CsvSource(value = {
            "1, 2, 3",
            "3, 4, 7",
            "5, 6, 11"
    })
    //@FieldSource(getSumData)
    public void sum(int firstNumber, int secondNumber, int expected) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);

        assertEquals(expected, result);
    }

    public static Object[] getSumData() {

        Object[][] objects = {
                {1, 9, 10},
                {1, 0, 1}, // передали тестовые данные
        }; return objects;

    }
}