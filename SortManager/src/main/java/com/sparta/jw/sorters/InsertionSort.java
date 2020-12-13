package com.sparta.jw.sorters;

public class InsertionSort implements Sortable{

    @Override
    public int[] sortArray(int[] arrayToSort) {

        for (int i = 1; i < arrayToSort.length; i++) {

            int key = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = key;
        }
        return arrayToSort;
    }

    @Override
    public double sortSpeed(int[] arrayToSort) {
        double start = System.nanoTime();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        return (finish - start)/1_000_000;
    }
}
