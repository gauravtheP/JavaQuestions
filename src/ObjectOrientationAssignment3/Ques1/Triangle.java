package ObjectOrientationAssignment3.Ques1;
/*
 * Created by gaurav.
 */
public class Triangle extends GeometricObject {
    Triangle(double side1, double side2, double side3){
        super(side1, side2, side3);        //implicit super() keyword added by
                                           //the compiler is overridden.
    }
    public double getArea(){
        double p = (side1+side2+side3)/2;
        double area = Math.sqrt((p)*(p-side1)*(p-side2)*(p-side3));
        return area;
    }
    public double getPerimeter(){
        double perimeter = side1+side2+side3;
        return perimeter;
    }
    public String toString(){
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 +
                ", side3 = " + side3;
    }
}