package com.sparta.jw.factories;

import com.sparta.jw.sorters.*;

public class SortFactory {

    public static Sortable sortFactory(String sorter){

        if (sorter.equalsIgnoreCase("BubbleSort")){  //Add in regex
            System.out.println("You have chosen: Bubble Sort\n");
            return new BubbleSort();
        }
        else if (sorter.equalsIgnoreCase("QuickSort")){
            System.out.println("You have chosen: Quick Sort\n");
            return new QuickSort();
        }
        else if (sorter.equalsIgnoreCase("BinaryTreeSort")){
            System.out.println("You have chosen: Binary Tree Sort\n");
            return new BinaryTreeSort();
        }
        else if (sorter.equalsIgnoreCase("MergeSort")){
            System.out.println("You have chosen: Merge Sort\n");
            return new MergeSort();
        }
        else if (sorter.equalsIgnoreCase("InsertionSort")){
            System.out.println("You have chosen: Insertion Sort\n");
            return new InsertionSort();
        }
        else if (sorter.equalsIgnoreCase("SelectionSort")){
            System.out.println("You have chosen: SelectionSort\n");
            return new SelectionSort();
        }
        else {
            return null;
        }
    }
}
