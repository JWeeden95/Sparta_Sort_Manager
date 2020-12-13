package com.sparta.jw.sortersSpeedTest;

import com.sparta.jw.exceptions.BadArrayInputException;
import com.sparta.jw.exceptions.MaxArrayLimitException;
import com.sparta.jw.randomiser.RandomArrayGenerator;
import com.sparta.jw.sorters.*;

public class SorterSpeeds {

    public static void main(String args[]) throws BadArrayInputException, MaxArrayLimitException {

        int[] arrayToSort = RandomArrayGenerator.randomArray(8892);

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("\nThe binary tree sort took: " + binaryTreeSort.sortSpeed(arrayToSort) + " milliseconds");
        System.out.println("The bubble sort took: " + bubbleSort.sortSpeed(arrayToSort) + " milliseconds");
        System.out.println("The insertion sort took: " + insertionSort.sortSpeed(arrayToSort) + " milliseconds");
        System.out.println("The merge sort took: " + mergeSort.sortSpeed(arrayToSort) + " milliseconds");
        System.out.println("The quick sort took: " + quickSort.sortSpeed(arrayToSort) + " milliseconds");
        System.out.println("The selection sort took: " + selectionSort.sortSpeed(arrayToSort) + " milliseconds");
    }
}
