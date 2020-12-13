package com.sparta.jw.sorters;

import com.sparta.jw.exceptions.MaxArrayLimitException;

public interface Sortable {

    int[] sortArray(int[] arrayToSort) throws MaxArrayLimitException;
    double sortSpeed(int[] arrayToSort) throws MaxArrayLimitException;
}
