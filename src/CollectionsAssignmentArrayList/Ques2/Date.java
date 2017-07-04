package CollectionsAssignmentArrayList.Ques2;

/*
 * Created by gaurav on 25/6/17.
 */
public class Date {
    int day, month, year;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "DATE\n"+"Date: "+day+"/"+month+"/"+year+"\n";
    }
}
