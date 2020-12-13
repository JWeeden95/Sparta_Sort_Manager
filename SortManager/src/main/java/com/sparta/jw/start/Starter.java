package com.sparta.jw.start;

import com.sparta.jw.exceptions.BadArrayInputException;
import com.sparta.jw.exceptions.MaxArrayLimitException;
import com.sparta.jw.factories.SortFactory;
import com.sparta.jw.randomiser.RandomArrayGenerator;
import com.sparta.jw.sorters.Sortable;
import com.sparta.jw.userDisplay.CommandLinePrompt;
import com.sparta.jw.userDisplay.InputScanner;
import com.sparta.jw.userDisplay.Reload;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Starter {

    public static void start() {

        CommandLinePrompt.greeting();
        CommandLinePrompt.chooseArraySize();
        try {
            int arrayLength = InputScanner.chosenArraySize();
            int[] randomArray = RandomArrayGenerator.randomArray(arrayLength);
            System.out.println("This is your random array of length " + arrayLength +":");
            System.out.println(Arrays.toString(randomArray));
            CommandLinePrompt.chooseSort();
            Sortable sorter = SortFactory.sortFactory(InputScanner.chosenSorter());
            System.out.println("Here is your sorted array: \n" + Arrays.toString(sorter.sortArray(randomArray)));
            System.out.println("\nThe sorter took " + sorter.sortSpeed(randomArray) + " seconds");
         } catch (NullPointerException e){
            System.out.println("This is not an available sorter");
            Reload.reload();
        } catch (InputMismatchException e){
            System.out.println("Input mismatch, please enter an integer");
            Reload.reload();
        } catch (BadArrayInputException e){
            System.out.println(e.getMessage());
            Reload.reload();
        } catch (MaxArrayLimitException e) {
            System.out.println(e.getMessage());
            Reload.reload();
        }

    }
}
