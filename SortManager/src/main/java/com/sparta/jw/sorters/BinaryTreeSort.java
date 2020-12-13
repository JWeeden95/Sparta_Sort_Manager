package com.sparta.jw.sorters;

import com.sparta.jw.binaryTree.BinaryTree;
import com.sparta.jw.randomiser.RandomArrayGenerator;
import com.sparta.jw.userDisplay.InputScanner;

public class BinaryTreeSort implements Sortable{

    @Override
    public int[] sortArray(int[] arrayToSort) {

        if (arrayToSort.length == 0 ){
            return null;
        }
        else {

            BinaryTree tree = new BinaryTree(arrayToSort[0]);
            for (int i = 1; i < arrayToSort.length; i++) {
                tree.addElement(arrayToSort[i]);
            }
            return tree.getSortedTreeAsc();
        }
    }

    @Override
    public double sortSpeed(int[] arrayToSort) {
        double start = System.nanoTime();
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        binaryTreeSort.sortArray(arrayToSort);
        double finish = System.nanoTime();
        return (finish - start)/1_000_000;
    }
}
