/*
 * Created by gaurav.
 */
/*Q5. (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.*/
package OperatorsAssignment;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes");
        long min = sc.nextLong();
        long hours = min/60;
        long days = hours/24;
        long years = days/365;
        System.out.println("Number of years are: "+years);
        System.out.println("Number of days are: "+days);
    }
}
