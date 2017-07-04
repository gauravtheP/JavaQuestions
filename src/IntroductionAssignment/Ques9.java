/*
 * Created by gaurav.
 */

/*Q9. Write a program that solves the following equation and displays the value for x and y:

					3.4x + 50.2y = 44.5
					2.1x + .55y = 5.9*/

package IntroductionAssignment;
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        System.out.println("Enter the Value of a");
        double a = sc.nextDouble();
        System.out.println("Enter the Value of b");
        double b = sc.nextDouble();
        System.out.println("Enter the Value of c");
        double c = sc.nextDouble();
        System.out.println("Enter the Value of d");
        double d = sc.nextDouble();
        System.out.println("Enter the Value of e");
        double e = sc.nextDouble();
        System.out.println("Enter the Value of f");
        double f = sc.nextDouble();
        if((d*b-e*a)!=0){
            double x = (b * f - e * c) / (d * b - e * a);
            System.out.println("Solution of x is: "+x);
        }
        else {
            System.out.println("There is no solution for x");
        }
        if((b*d-a*e)!=0) {
            double y = (c * d - a * f) / (b * d - a * e);
            System.out.println("Solution of y is: "+y);
        }
        else {
            System.out.println("There is no solution for y");
        }
    }
}
