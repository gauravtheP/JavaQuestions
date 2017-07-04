package CollectionsAssignmentArrayList.Ques3;
import java.util.Scanner;
/*
 * Created by gaurav on 27/6/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.println("Enter 5 Strings");
        for (int i = 0; i <5; i++) {
            String strings = sc.next();
            myStack.insert(strings);
        }
        System.out.println(myStack.toString());
    }
}
