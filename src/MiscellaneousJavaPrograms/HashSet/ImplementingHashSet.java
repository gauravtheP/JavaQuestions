/*
 * Created on 24/5/17.
 */
package MiscellaneousJavaPrograms.HashSet;
import java.util.*;

class students{
    int id;
    String course;
    public students(int id, String course){
        this.id = id;
        this.course =course;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object o){
        if(o instanceof students){
            return this.id == ((students)o).id && this.course == ((students)o).course;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return("Id is: "+id+" & "+ "Course is: "+course);
    }
}
public class ImplementingHashSet {
    public static void main(String[] args){
        Set<students> ss = new HashSet<>();
        ss.add(new students(1,"c"));
        ss.add(new students(2,"java"));
        ss.add(new students(3,"python"));
        ss.add(new students(4,"c++"));
        ss.remove(new students(2,"java"));
        System.out.println(ss);
    }
}
