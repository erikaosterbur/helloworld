package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Write a Java program to convert seconds to hour, minute and seconds from total seconds.
        * Input seconds: 86399 -> Output: 23:59:59
        * */

        int time = 86399;
        int hours = time/3600;
        int minutesLeft = 86399 - ( hours * 3600 );
        int minutes = minutesLeft/60;
        int secondsLeft = minutesLeft - ( minutes * 60 );
        System.out.println(hours + ":" + minutes + ":" + secondsLeft );


    }
}
