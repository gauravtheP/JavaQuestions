package ObjectOrientationAssignment3.Ques2;

/*
 * Created by gaurav on 15/6/17.
 */
public class Staff extends Employee{
    private String title;
    public Staff(){
        super();
        title = "xxxx";
    }
    public Staff(String type, String name, String address, String phoneNo, String email, String office, int salary, MyDate dateHired, String title){
        super(type, name, address, phoneNo, email, office, salary, dateHired);
        this.title = title;
    }
    public String toString(){
        return super.toString()+"\nTitle: "+title;
    }
}
