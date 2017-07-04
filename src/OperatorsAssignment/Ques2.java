/*
 * Created by gaurav.
 */
/*Q2: (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length*/

package OperatorsAssignment;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and Height");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double pi = 3.142857143;
        double area = (2 * pi * radius * height) + (2 * pi * radius * radius);
        double volume = pi * radius * radius * height;
        System.out.println("Area of Cylinder is: " + area + "\nVolume of Cylinder is: " + volume);
    }
}
