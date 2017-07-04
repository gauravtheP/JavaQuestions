/*
 * Created by gaurav.
 */
/*Q1: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32*/

package OperatorsAssignment;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value in celsius");
        double celsius = sc.nextDouble();
        double Fahrenheit = (9 * celsius)/5 + 32;
        System.out.println("Value in Fahrenheit is: "+Fahrenheit);
    }
}

