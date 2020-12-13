package com.sparta.jw.sortersTest;

import com.sparta.jw.sorters.BinaryTreeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeSortTest {

    @Test
    void returnsNothingFromEmptyArray(){
        BinaryTreeSort nothing = new BinaryTreeSort();
        int[] input = {};
        nothing.sortArray(input);
    }

    @Test
    void returnsSingleNumberFromSingleNumber(){
        BinaryTreeSort single = new BinaryTreeSort();
        int[] input = {2};
        int[] expected = {2};
        Assertions.assertArrayEquals(expected, single.sortArray(input));
    }

    @Test
    void doesSortThreeTwoOne(){
        BinaryTreeSort threeTwoOne = new BinaryTreeSort();
        int[] input = {3,2,1};
        int[] expected = {1,2,3};
        Assertions.assertArrayEquals(expected, threeTwoOne.sortArray(input));
    }

    @Test
    void doesSortRandom(){
        BinaryTreeSort random = new BinaryTreeSort();
        int[] input = {3,4,23,76,1,4,2,90,23};
        int[] expected = {1,2,3,4,4,23,23,76,90};
        Assertions.assertArrayEquals(expected, random.sortArray(input));
    }
}
