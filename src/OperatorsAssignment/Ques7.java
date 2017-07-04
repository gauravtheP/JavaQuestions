/*
 * Created by gaurav.
 */
/*Q7. (Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.*/

package OperatorsAssignment;
import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of y1");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of x2");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of y2");
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Distance is: "+distance);
    }
}
