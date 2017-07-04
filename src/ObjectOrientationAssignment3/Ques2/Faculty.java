package ObjectOrientationAssignment3.Ques2;

/*
 * Created by gaurav on 15/6/17.
 */
public class Faculty extends Employee{
    private int officeHours;
    private String rank;
    public Faculty(){
        super();
        officeHours = 0000;
        rank = "xxxx";
    }
    public Faculty(String type, String name, String address, String phoneNo, String email, String office, int salary, MyDate dateHired, int officeHours, String rank){
        super(type, name, address, phoneNo, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String toString(){
        return super.toString()+"\nOffice Hours: "+officeHours+"\nRank: "+rank;
    }
}