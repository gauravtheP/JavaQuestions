package ControlStatementsAssignments4;
import java.util.Scanner;
/*
 * Created by gaurav.
 */
/*Q4. (Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.*/
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        System.out.println("Enter Month");
        int month = sc.nextInt();
        if(month==1){
            System.out.println("January "+year+" has 31 days");
        }
        if(month==2){
            if((year%400 == 0) || ((year%4 == 0) && (year%100!=0))) {
                System.out.println("February " + year + " has 29 days");
            }
            else{
                System.out.println("February " + year + " has 28 days");
            }
        }
        if(month==3){
            System.out.println("March "+year+" has 31 days");
        }
        if(month==4){
            System.out.println("April "+year+" has 30 days");
        }
        if(month==5){
            System.out.println("May "+year+" has 31 days");
        }
        if(month==6){
            System.out.println("June "+year+" has 30 days");
        }
        if(month==7){
            System.out.println("July "+year+" has 31 days");
        }
        if(month==8){
            System.out.println("August "+year+" has 31 days");
        }
        if(month==9){
            System.out.println("September "+year+" has 30 days");
        }
        if(month==10){
            System.out.println("October "+year+" has 31 days");
        }
        if(month==11){
            System.out.println("November "+year+" has 30 days");
        }
        if(month==12){
            System.out.println("December "+year+" has 31 days");
        }
        if(month<1 || month>12){
            System.out.println("Invalid month :(");
        }
    }
}
