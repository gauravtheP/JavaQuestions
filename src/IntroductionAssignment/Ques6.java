/*
 * Created by gaurav.
 */
/*Q6. (Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
						area = width * height*/

package IntroductionAssignment;
public class Ques6 {
    public static void main(String[] args){
        double height = 7.9;
        double width = 4.5;
        double area = height*width;
        double perimeter = 2*(height+width);
        System.out.println("Area of Rectangle is: "+area);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
    }
}
