package ObjectOrientationAssignment3.Ques2;
/*
 * Created by gaurav.
 */
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    /* Creates a MyDate object for the current date */
    MyDate() {
        GregorianCalendar calender = new GregorianCalendar();
        day = calender.get(GregorianCalendar.DAY_OF_MONTH);
        month = calender.get(GregorianCalendar.MONTH);
        year = calender.get(GregorianCalendar.YEAR);
    }
    MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
}
