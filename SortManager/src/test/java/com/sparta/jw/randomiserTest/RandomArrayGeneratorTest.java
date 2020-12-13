package com.sparta.jw.randomiserTest;

import com.sparta.jw.exceptions.BadArrayInputException;
import com.sparta.jw.randomiser.RandomArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomArrayGeneratorTest {

    @Test
    void doesZeroGiveException() {
        Exception e = Assertions.assertThrows(BadArrayInputException.class, () -> {
            RandomArrayGenerator.randomArray(0);});
        String expectedMessage = "Must be a positive integer";
        String actualMessage = e.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void doesNegativeGiveException() {
        Exception e = Assertions.assertThrows(BadArrayInputException.class, () -> {
            RandomArrayGenerator.randomArray(-1);});
        String expectedMessage = "Must be a positive integer";
        String actualMessage = e.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

}
