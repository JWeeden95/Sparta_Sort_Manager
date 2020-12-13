package com.sparta.jw.sorters;

import com.sparta.jw.randomiser.RandomArrayGenerator;
import com.sparta.jw.userDisplay.InputScanner;

public class BubbleSort implements Sortable {

    @Override
    public int[] sortArray(int[] arrayToSort) {

        boolean isSorted = false;

        while (!isSorted) {

            int checker = 0;
            for (int i = 1; i < arrayToSort.length; i++) {

                int temp = arrayToSort[i];

                if (arrayToSort[i] < arrayToSort[i - 1]) {

                    arrayToSort[i] = arrayToSort[i - 1];
                    arrayToSort[i - 1] = temp;
                    checker++;

                } else {
                    continue;
                }
            }
            if (checker == 0){
                isSorted = true;
            }
        }
        return arrayToSort;
    }
    @Override
    public double sortSpeed(int[] arrayToSort){

        double start = System.nanoTime();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        return (finish - start)/1_000_000;
    }
}
