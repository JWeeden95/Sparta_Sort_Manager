package com.sparta.jw.sorters;

public class MergeSort implements Sortable{

    @Override
    public int[] sortArray(int[] arrayToSort) {

        if (arrayToSort.length < 2) {
            return arrayToSort;
        }
        int midpoint = arrayToSort.length / 2;
        int[] leftArray = new int[midpoint];
        int[] rightArray = new int[arrayToSort.length - midpoint];

        for (int i = 0; i < midpoint; i++) {
            leftArray[i] = arrayToSort[i];
        }
        for (int i = midpoint; i < arrayToSort.length; i++) {
            rightArray[i - midpoint] = arrayToSort[i];
        }
        sortArray(leftArray);
        sortArray(rightArray);
        return merge(arrayToSort, leftArray, rightArray, midpoint, arrayToSort.length - midpoint);
    }

    public static int[] merge(int[] arrayToSort, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                arrayToSort[k++] = leftArray[i++];
            }
            else {
                arrayToSort[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            arrayToSort[k++] = leftArray[i++];
        }
        while (j < right) {
            arrayToSort[k++] = rightArray[j++];
        }
        return arrayToSort;
    }

    @Override
    public double sortSpeed(int[] arrayToSort) {
        double start = System.nanoTime();
        MergeSort mergeSort = new MergeSort();
        mergeSort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        return (finish - start)/1_000_000;
    }
}
