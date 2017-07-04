/*
 * Created by gaurav.
 */
/*Q6: (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.*/
package OperatorsAssignment;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight(in pounds)");
        double weight = sc.nextDouble();
        System.out.println("Enter your height(in inches)");
        double height = sc.nextDouble();
        double weightKG = weight * 0.45359237;
        double heightM = height * 0.0254;
        double heightM2 = Math.pow(heightM, 2);
        if (heightM2 != 0) {
            double bmi = weightKG / heightM2;
            System.out.println("Your BMI is: " + bmi);
        }
        else {
            System.out.println("Height is invalid!!!");
        }
    }
}
