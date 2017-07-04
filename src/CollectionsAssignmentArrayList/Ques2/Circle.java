package CollectionsAssignmentArrayList.Ques2;

/*
 * Created by gaurav on 25/6/17.
 */

public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    private double CalArea(){
        double area = (22*radius*radius)/7;
        return area;
    }
    private double CalCircumference(){
       double circumference = (2*22*radius)/7;
        return circumference;
    }
    public String toString(){
        return "CIRCLE\n"+"Radius: "+radius+"cm"+ "\nArea: "+CalArea()+"cm2"+"\nCircumference: "+CalCircumference()+"cm\n";
    }
}
