package ObjectOrientationAssignment3.Ques1;
/*
 * Created by gaurav on 14/6/17.
 */
/*
Q1: (The Triangle class) Design a class named Triangle that extends
 GeometricObject. The class contains:
 Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
 ■ A no-arg constructor that creates a default triangle.
 ■ A constructor that creates a triangle with the specified side1, side2, and
   side3.
 ■ The accessor methods for all three data fields.
 ■ A method named getArea() that returns the area of this triangle.
 ■ A method named getPerimeter() that returns the perimeter of this triangle.
 ■ A method named toString() that returns a string description for the triangle.

The toString() method is implemented as follows:

 return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 " side3 = " + side3;*/
public class Main {
    public static void main(String[] args){
        Triangle tr = new Triangle(19,24,30.6);
        System.out.println("Area of Triangle is: "+tr.getArea());
        System.out.println("Perimeter of Triangle is: "+tr.getPerimeter());
        System.out.println(tr.toString());
    }
}
