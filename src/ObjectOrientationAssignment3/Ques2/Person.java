package ObjectOrientationAssignment3.Ques2;

/*
 * Created by gaurav on 15/6/17.
 */
public class Person {
    protected String type;
    protected String name;
    protected String address;
    protected String phoneNo;
    protected String email;

    public Person(){
        type = "xxxx";
        name = "xxxx";
        address = "xxxx";
        phoneNo = "xxxx";
        email = "xxxx";
    }

    public Person(String type, String name, String address, String phoneNo, String email){
        this.type = type;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String toString(){
        return "Type: "+type+"\nName: "+name+"\nAddress: "+address+"\nPhNo: "+phoneNo+"\nEmailID: "+email;
    }
}
