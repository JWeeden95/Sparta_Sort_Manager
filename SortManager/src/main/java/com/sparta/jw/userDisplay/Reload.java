package com.sparta.jw.userDisplay;

import com.sparta.jw.start.Starter;

public class Reload {

    public static void reload(){
        CommandLinePrompt.startAgain();
        if (UserDecisions.yesOrNo(InputScanner.yesOrNo())) {
            Starter.start();
        } else{
            System.out.println("Ending programme");
        }
    }
}
