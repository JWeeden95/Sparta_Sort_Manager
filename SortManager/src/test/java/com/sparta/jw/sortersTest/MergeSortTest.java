package com.sparta.jw.sortersTest;

import com.sparta.jw.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    void returnsNothingFromEmptyArray(){
        MergeSort nothing = new MergeSort();
        int[] input = {};
        nothing.sortArray(input);
    }

    @Test
    void returnsSingleNumberFromSingleNumber(){
        MergeSort single = new MergeSort();
        int[] input = {2};
        int[] expected = {2};
        Assertions.assertArrayEquals(expected, single.sortArray(input));
    }

    @Test
    void doesSortThreeTwoOne(){
        MergeSort threeTwoOne = new MergeSort();
        int[] input = {3,2,1};
        int[] expected = {1,2,3};
        Assertions.assertArrayEquals(expected, threeTwoOne.sortArray(input));
    }

    @Test
    void doesSortRandom(){
        MergeSort random = new MergeSort();
        int[] input = {3,4,23,76,1,4,2,90,23};
        int[] expected = {1,2,3,4,4,23,23,76,90};
        Assertions.assertArrayEquals(expected, random.sortArray(input));
    }
}
