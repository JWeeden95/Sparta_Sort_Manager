package com.sparta.jw.binaryTree;

import com.sparta.jw.exceptions.ChildNotFoundException;

public interface Treeable {

        int getRootElement();
        int getNumberOfElements();
        void addElements(final int[] elements);
        void addElement(final int element);
        boolean findElement(final int value);
        int getLeftChild(int element) throws ChildNotFoundException;
        int getRightChild(int element) throws ChildNotFoundException;
        int[] getSortedTreeAsc();
        int[] getSortedTreeDesc();
}
