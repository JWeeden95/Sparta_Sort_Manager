package com.sparta.jw.sorters;

public class SelectionSort implements Sortable {

    @Override
    public int[] sortArray(int[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arrayToSort.length; j++) {

                if (arrayToSort[minIndex] > arrayToSort[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {

                int tempInt = arrayToSort[i];

                arrayToSort[i] = arrayToSort[minIndex];
                arrayToSort[minIndex] = tempInt;
            }
        }
        return arrayToSort;
    }

    @Override
    public double sortSpeed(int[] arrayToSort) {
        double start = System.nanoTime();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        return (finish - start)/1_000_000;
    }
}
