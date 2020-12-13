package com.sparta.jw.userDisplay;

public class UserDecisions {

    public static boolean yesOrNo(String decision){

        while (true) {
            if (decision.equalsIgnoreCase("Y")) {
                return true;
            }
            if (decision.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Enter 'Y' or 'N', please");
                continue;
            }
        }

    }
}
