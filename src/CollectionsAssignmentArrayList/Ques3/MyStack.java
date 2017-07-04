package CollectionsAssignmentArrayList.Ques3;
import java.util.ArrayList;
/*
 * Created by gaurav on 25/6/17.
 */
/*Q3. (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented
using composition. Define a new stack class that extends ArrayList.
 Write a test program that prompts the user to enter five strings and displays them in
 reverse order*/

public class MyStack extends ArrayList {
    private ArrayList<String> list;

    MyStack(){
        list = new ArrayList<>();
    }
    protected void insert(String S){
        list.add(0, S);
    }
    public String toString(){
        return "Strings in reverse order are: "+list.toString();
    }
}
/*Here above every time the element is inserted at position 0 so, therefore the
* previously inserted element is pushed onto next position and so on.
* In the end the last element will occupy the 0th position and second last will
* occupy the 1st position and 3rd last will occupy the 2nd position and so on.
* Hence, the elements will automatically be displayed in reverse order.
* This is actually the implementation of stack without the usage of stack class.*/