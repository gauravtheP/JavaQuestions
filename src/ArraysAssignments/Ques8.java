package ArraysAssignments;

/*
 * Created by gaurav on 18/6/17.
 */
/*8. Write a program to find third smallest element in the given array?*/

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int j = 0;
        double smallest = Double.POSITIVE_INFINITY;

        for(int i = 0; i<size; i++){
                if(smallest>arr[i]){
                    smallest = arr[i];
                    j = i;
                }
            }
        System.out.println("Smallest is: "+(int)smallest);

        int k = 0;
        double SecondSmallest = Double.POSITIVE_INFINITY;

        for(int i = 0; i<size; i++){
            if(SecondSmallest>arr[i] && i!=j){
                SecondSmallest = arr[i];
                k = i;
            }
        }
        System.out.println("SecondSmallest is: "+(int)SecondSmallest);

        double ThirdSmallest = Double.POSITIVE_INFINITY;
        for(int i = 0; i<size; i++){
            if(ThirdSmallest>arr[i] && i!=j && i!=k){
                ThirdSmallest = arr[i];
            }
        }
        System.out.println("Third smallest is: "+(int)ThirdSmallest);
    }
}

//Another way of doing this program.

/*import java.util.Arrays;

public class ThirdSmallest
{
	public static void main(String args[]){
		int array[]={1,20,5,6,16,10};
		Arrays.sort(array);
		System.out.println("3rd smallest element is:"+array[2]);
	}

}*/