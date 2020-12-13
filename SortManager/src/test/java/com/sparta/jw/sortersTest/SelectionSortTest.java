package com.sparta.jw.sortersTest;

import com.sparta.jw.sorters.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    void returnsNothingFromEmptyArray(){
        SelectionSort nothing = new SelectionSort();
        int[] input = {};
        nothing.sortArray(input);
    }

    @Test
    void returnsSingleNumberFromSingleNumber(){
        SelectionSort single = new SelectionSort();
        int[] input = {2};
        int[] expected = {2};
        Assertions.assertArrayEquals(expected, single.sortArray(input));
    }

    @Test
    void doesSortThreeTwoOne(){
        SelectionSort threeTwoOne = new SelectionSort();
        int[] input = {3,2,1};
        int[] expected = {1,2,3};
        Assertions.assertArrayEquals(expected, threeTwoOne.sortArray(input));
    }

    @Test
    void doesSortRandom(){
        SelectionSort random = new SelectionSort();
        int[] input = {3,4,23,76,1,4,2,90,23};
        int[] expected = {1,2,3,4,4,23,23,76,90};
        Assertions.assertArrayEquals(expected, random.sortArray(input));
    }
}
