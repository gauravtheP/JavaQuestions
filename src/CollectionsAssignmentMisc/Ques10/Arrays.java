package CollectionsAssignmentMisc.Ques10;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Created by gaurav on 25/6/17.
 */
/*Write a program to count number of smaller elements on right of each element in
an array.
Example :
	Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4}
	Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0}*/

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> countSmaller = new ArrayList<>();
        int count = 0;
        System.out.println("How many array elements you want to enter");
        int size = sc.nextInt();
        System.out.println("Enter array Elements");
        for(int i = 0; i<size;i++){
            list.add(sc.nextInt());
        }
        for(int i = 0;i<size; i++){
            for(int j = i+1; j<size; j++){
                if(list.get(i)>list.get(j)){
                    count++;
                }
            }
            countSmaller.add(i, count);
            count = 0;
        }
        System.out.println("countSmaller[]  =  "+countSmaller);
    }
}
