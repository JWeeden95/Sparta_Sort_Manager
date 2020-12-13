package com.sparta.jw.sorters;

import com.sparta.jw.exceptions.MaxArrayLimitException;
import com.sparta.jw.randomiser.RandomArrayGenerator;
import com.sparta.jw.sorters.Sortable;
import com.sparta.jw.userDisplay.InputScanner;

public class QuickSort implements Sortable {

    @Override
    public int[] sortArray(int[] arrayToSort) throws MaxArrayLimitException {

        if (arrayToSort.length >= 8893){
            throw new MaxArrayLimitException();
        }
        else {
            return quickSort(arrayToSort, 0, arrayToSort.length - 1);
        }
    }

    public int[] quickSort(int[] arrayToSort, int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(arrayToSort, begin, end);

            quickSort(arrayToSort, begin, partitionIndex - 1);
            quickSort(arrayToSort, partitionIndex + 1, end);
        }
        return arrayToSort;
    }

    private int partition(int[] arrayToSort, int begin, int end) {
        int pivot = arrayToSort[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arrayToSort[j] <= pivot) {
                i++;

                int swapTemp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = swapTemp;
            }
        }

        int swapTemp = arrayToSort[i + 1];
        arrayToSort[i + 1] = arrayToSort[end];
        arrayToSort[end] = swapTemp;

        return i + 1;
    }

    @Override
    public double sortSpeed(int[] arrayToSort) throws MaxArrayLimitException {
        double start = System.nanoTime();
        QuickSort quickSort = new QuickSort();
        quickSort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        return (finish - start)/1_000_000;
    }
}
