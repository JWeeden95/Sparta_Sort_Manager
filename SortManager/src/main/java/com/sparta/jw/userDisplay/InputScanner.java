package com.sparta.jw.userDisplay;

import com.sparta.jw.sorters.BubbleSort;
import com.sparta.jw.sorters.Sortable;

import java.util.Scanner;

public class InputScanner {

    public static String chosenSorter() {
        Scanner sorterScan = new Scanner(System.in);
        String sortType = sorterScan.next();
        return sortType;
    }

    public static int chosenArraySize(){
        Scanner arraySizeScan = new Scanner(System.in);
        int arraySize = arraySizeScan.nextInt();
        return arraySize;
    }

    public static String yesOrNo() {
        Scanner yesNoScan = new Scanner(System.in);
        String yesNoString = yesNoScan.next();
        return yesNoString;
    }
}
