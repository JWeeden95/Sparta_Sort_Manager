package com.sparta.jw.randomiser;

import com.sparta.jw.exceptions.BadArrayInputException;
import com.sparta.jw.exceptions.MaxArrayLimitException;
import com.sparta.jw.userDisplay.InputScanner;

import java.util.InputMismatchException;
import java.util.Random;

public class RandomArrayGenerator {

    public static int[] randomArray(int arraySize) throws InputMismatchException, BadArrayInputException, MaxArrayLimitException {

        if (arraySize <= 0){
            throw new BadArrayInputException();
        } else if (arraySize >= 8893){
            throw new MaxArrayLimitException();
        }
        else {

            int[] randomArray = new int[arraySize];
            Random random = new Random();

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = random.nextInt(arraySize) + 1;
            }
            return randomArray;
        }
    }
}
