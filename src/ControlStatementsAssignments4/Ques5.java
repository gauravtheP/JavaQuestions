package ControlStatementsAssignments4;
import java.util.Scanner;
/*
 * Created by gaurav.
 */
/*Q5. (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. StringDisplay
the average as a floating-point number.*/
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=1;
        double number, sum = 0, count = 0, average;
        System.out.println("Enter numbers to compute average");
        while(flag!=0) {
            count = count + 1;
            number = sc.nextInt();
            if (number == 0) {
                count = count - 1;
                flag = 0;
            }
            sum = sum + number;
        }
        average = sum/count;
        System.out.println("Total of all the number entered is: "+sum);
        System.out.println("Average of all the number entered is: "+average);
    }
}
