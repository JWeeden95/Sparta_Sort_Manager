package com.sparta.jw.userDisplay;

public class CommandLinePrompt {

    public static void greeting(){
        System.out.println("------------------------------------------");
        System.out.println("Hello, welcome to Josh's Sort Mananger(TM)");
        System.out.println("------------------------------------------");
        return;
    }

    public static void chooseSort(){
        System.out.println("\nWhich sorting algorithm would you like to use? (Enter name with no spaces)");
        System.out.println("\nYour options are: ");
        System.out.println("\n    BubbleSort\n" +
                "    InsertionSort\n" +
                "    MergeSort\n" +
                "    QuickSort\n" +
                "    SelectionSort\n" +
                "    BinaryTreeSort\n");
    }
    public static void chooseArraySize(){
        System.out.println("\nPlease enter the size of the array you would like to sort...");
    }

    public static void startAgain(){
        System.out.println("\nWould you like to start again? (Y/N)");
    }
}
