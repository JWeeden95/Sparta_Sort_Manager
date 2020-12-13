package com.sparta.jw.binaryTree;

import com.sparta.jw.exceptions.ChildNotFoundException;

import java.util.ArrayList;

public class BinaryTree implements Treeable {

    private final Node rootNode;
    private int nodeCount = 1;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public void addElement(final int element){

        addNodeToTree(rootNode, element);
    }

    private void addNodeToTree(Node node, int element) {

        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()){

                node.setLeftChild(new Node(element));
                nodeCount++;
            }
            else {
                addNodeToTree(node.getLeftChild(), element);
            }
        }
        else if (element > node.getValue()){
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
                nodeCount++;
            }
            else {
                addNodeToTree(node.getRightChild(), element);
            }
            if (element == node.getValue()){
                return;
            }
        }
    }

    public Node findNode(int element){

        Node node = rootNode;

        while (node != null){
            if (element == node.getValue()){
                return node;
            }
            if (element < node.getValue()){
                node = node.getLeftChild();
            }
            else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return nodeCount;
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements){
            addNodeToTree(rootNode, element);
        }
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {

        Node node = findNode(element);

        if (node.isLeftChildEmpty()){
            throw new ChildNotFoundException();
        }
        else {
            return node.getLeftChild().getValue();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {

        Node node = findNode(element);

        if (node.isRightChildEmpty()){
            throw new ChildNotFoundException();
        }
        else {
            return node.getRightChild().getValue();
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = rootNode;

        while (node != null){
            if (value == node.getValue()){
                return true;
            }
            if (value < node.getValue()){
                node = node.getLeftChild();
            }
            else {
                node = node.getRightChild();
            }
        }
        return false;
    }

    @Override
    public int[] getSortedTreeAsc() {
        ArrayList<Integer> treeArray = new ArrayList<>();
        getSortedTreeAsc(rootNode, treeArray);

        int[] sortedArray = new int[treeArray.size()];

        if (treeArray.size() == 0) {
            return null;
        }
        else {

            for (int i = 0; i < sortedArray.length; i++) {
                sortedArray[i] = treeArray.get(i).intValue();
            }
            return sortedArray;
        }
    }

    public ArrayList<Integer> getSortedTreeAsc(Node node, ArrayList<Integer> array) {
        if(node == null)
            return array;

        getSortedTreeAsc(node.getLeftChild(), array);
        array.add(node.getValue());
        getSortedTreeAsc(node.getRightChild(), array);

        return array;
    }

    @Override
    public int[] getSortedTreeDesc() {

        ArrayList<Integer> treeArray = new ArrayList<>();
        getSortedTreeDesc(rootNode, treeArray);

        int[] sortedArray = new int[treeArray.size()];

        for (int i=0; i < sortedArray.length; i++) {
            sortedArray[i] = treeArray.get(i).intValue();
        }
        return sortedArray;
    }

    public ArrayList<Integer> getSortedTreeDesc(Node node, ArrayList<Integer> array) {
        if(node == null)
            return array;

        getSortedTreeAsc(node.getRightChild(), array);
        array.add(node.getValue());
        getSortedTreeAsc(node.getLeftChild(), array);

        return array;
    }




}
