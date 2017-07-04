/*
 * Created by gaurav.
 */

/*Q5. (Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi*/

package IntroductionAssignment;
public class Ques5 {
    public static void main(String[] args){
        double radius = 5.5;
        double pi = 3.142857143;
        double area;
        double perimeter;
        area = pi*radius*radius;
        perimeter = 2*pi*radius;
        System.out.println("Area of Circle is: "+area);
        System.out.println("Perimeter of Circle is: "+perimeter);
    }
}
