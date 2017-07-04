package CollectionsAssignmentArrayList.Ques5;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Created by gaurav on 25/6/17.
 */
/*Q5.  (Remove duplicates) Write a method that removes the duplicate elements from
 an array list of integers using the following header:

         public static void removeDuplicate(ArrayList<Integer> list)

 Write a test program that prompts the user to enter 10 integers to a list and
 displays the distinct integers separated by exactly one space.*/

public class RemoveDuplicates {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Integers");
        for(int i = 0; i<10; i++){
            list.add(sc.nextInt());
        }
        removeDuplicate(list);
    }

    private static void removeDuplicate(ArrayList<Integer> list){
        System.out.print("Distinct elements are: ");
        for(int i = 0; i<list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).intValue() == list.get(j).intValue()) //unboxing is done.
                                                                      //Integer is converted
                                                                      //primitive int.
                {
                    list.remove(list.get(j));
                    j--;
                }
            }
            System.out.print(list.get(i)+" ");
        }
    }
}
