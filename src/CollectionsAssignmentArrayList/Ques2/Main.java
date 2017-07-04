package CollectionsAssignmentArrayList.Ques2;

import java.util.ArrayList;

/*
 * Created by gaurav on 26/6/17.
 */
/*Q2. (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 object, a Date object, a string, and a Circle object to the list, and use a
 loop to display all the elements in the list by invoking the object’s
 toString() method.*/
public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Circle circle = new Circle(5);
        Date date = new Date(17, 4,1771);
        Loan loan = new Loan(500000,5,9.25);

        list.add(circle.toString());
        list.add(date.toString());
        list.add(loan.toString());

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
