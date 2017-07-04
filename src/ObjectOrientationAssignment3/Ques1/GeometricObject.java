package ObjectOrientationAssignment3.Ques1;

/*
 * Created by gaurav.
 */
public class GeometricObject {
    protected double side1;
    protected double side2;
    protected double side3;
    GeometricObject() {
        this(1.0, 1.0, 1.0);
    }
    GeometricObject(double s1, double s2, double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
}
