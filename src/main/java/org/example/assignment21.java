/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for the number of month
        System.out.println("Please enter the number of the month");
        int monthNumber = scan.nextInt();
        Boolean incorrect = Boolean.FALSE;

        String month = null;


        switch(monthNumber) {
            case 1:
                month = "January";
                break;

            case 2:
                month = "February";
                break;

            case 3:
                month = "March";
                break;

            case 4:
                month = "April";
                break;

            case 5:
                month = "May";
                break;

            case 6:
                month = "June";
                break;

            case 7:
                month = "July";
                break;

            case 8:
                month = "August";
                break;

            case 9:
                month = "September";
                break;

            case 10:
                month = "October";
                break;

            case 11:
                month = "November";
                break;

            case 12:
                month = "December";
                break;

            default:
                incorrect = Boolean.TRUE;
                break;
        }

        //print out the month or error code (only doing it this way b/c the assignment says so)
        String message = !incorrect ? "The name of the month is " + month : "Entered number doesn't correlate to a month";
        System.out.println(message);

    }
}
