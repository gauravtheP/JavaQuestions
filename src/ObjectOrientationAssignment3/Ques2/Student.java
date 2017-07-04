package ObjectOrientationAssignment3.Ques2;

/*
 * Created by gaurav on 15/6/17.
 */
public class Student extends Person {
    private int status;
    public final static int Freshman = 1;
    public final static int Sophomore = 2;
    public final static int Junior = 3;
    public final static int Senior = 4;

    public Student(){
        super();
        status = 0000;
    }
    public Student(String type, String name, String address, String phone, String email, int status) {
        super(type, name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "Freshman";
            case 2 : return "Sophomore";
            case 3 : return "Junior";
            case 4 : return "Senior";
            default : return "Unknown";
        }
    }

    public String toString() {
        return super.toString()+"\nStatus: "+getStatus();
    }
}