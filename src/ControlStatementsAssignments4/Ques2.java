package ControlStatementsAssignments4;
import java.util.Scanner;
/*
 * Created by gaurav.
 */
/*Q2: (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.*/

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer for today's day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6)");
        int day = sc.nextInt();
        System.out.println("Enter number of days after today's day for display of future day of the week");
        int nextDays = sc.nextInt();
        int userEnteredNumberofDays = nextDays;

        while((nextDays % 7)!=0) {
            nextDays = nextDays - 1;
        }
        int extraDays = userEnteredNumberofDays-nextDays;
        int futureDay = day+extraDays;
        if(futureDay>6){
            futureDay = futureDay-7;
        }
        if(futureDay==0){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Sunday");
        }
        if(futureDay==1){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Monday");
        }
        if(futureDay==2){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Tuesday");
        }
        if(futureDay==3){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Wednesday");
        }
        if(futureDay==4){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Thursday");
        }
        if(futureDay==5){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Friday");
        }
        if(futureDay==6){
            System.out.println("After "+userEnteredNumberofDays+"days the day of the week will be: Saturday");
        }
    }
}
