package ObjectOrientationAssignment3.Ques2;

/*
 * Created by gaurav on 15/6/17.
 */
public class Employee extends Person{
    protected String office;
    protected int salary;
    protected MyDate dateHired;
    public Employee(){
        super();
        office = "xxxx";
        salary = 0000;
        dateHired = new MyDate();
    }
    public Employee(String type, String name, String address, String phoneNo, String email, String office, int salary, MyDate dateHired){
        super(type, name, address, phoneNo, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public String getDateHired(){
        return dateHired.getDay()+"/"+dateHired.getMonth()+"/"+dateHired.getYear();
    }
    public String toString(){
        return super.toString()+"\nOffice: "+office+"\nSalary: $"+salary+"\nDate Hired: "+getDateHired();
    }
}