package com.example.demo.util;

public class ContainerNumValidator {

    public static boolean validator(String containerNum){
        int[] test = {0,0};

        if(containerNum.length()==11){
            for (int i = 0; i<11;i++){
                char positionChar = containerNum.charAt(i);
                String positionString = positionChar+"";

                if(i<4 && positionString.matches("[A-Z]*")){
                    test[0] += 1;
                }
                if(i>3 && positionString.matches("[0-9]*")){
                    test[1] += 1;
                }
            }
        }
        return test[0]==4 && test[1]==7;
    }
}
