package com.sparta.jw.sortersTest;

import com.sparta.jw.exceptions.MaxArrayLimitException;
import com.sparta.jw.sorters.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    void returnsNothingFromEmptyArray() throws MaxArrayLimitException {
        QuickSort nothing = new QuickSort();
        int[] input = {};
        nothing.sortArray(input);
    }

    @Test
    void returnsSingleNumberFromSingleNumber() throws MaxArrayLimitException {
        QuickSort single = new QuickSort();
        int[] input = {2};
        int[] expected = {2};
        Assertions.assertArrayEquals(expected, single.sortArray(input));
    }

    @Test
    void doesSortThreeTwoOne() throws MaxArrayLimitException {
        QuickSort threeTwoOne = new QuickSort();
        int[] input = {3,2,1};
        int[] expected = {1,2,3};
        Assertions.assertArrayEquals(expected, threeTwoOne.sortArray(input));
    }

    @Test
    void doesSortRandom() throws MaxArrayLimitException {
        QuickSort random = new QuickSort();
        int[] input = {3,4,23,76,1,4,2,90,23};
        int[] expected = {1,2,3,4,4,23,23,76,90};
        Assertions.assertArrayEquals(expected, random.sortArray(input));
    }
}
