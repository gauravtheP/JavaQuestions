package CollectionsAssignmentMisc.Ques7;
import java.util.HashMap;
import java.util.Scanner;
/*
 * Created by gaurav on 25/6/17.
 */
/*Given an array A[] and a number x, check for pair in A[] with sum as x using
HashMap?
		Example :
			Input : 10, 30, 50, 67, 34, 68
				   x = 60
		    output : 10, 50*/

public class HashMap1 {
    private static int size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many array elements you want to enter");
        size = sc.nextInt();

        Integer [] array = new Integer[size];
        System.out.println("Enter array Elements");
        for(int i = 0; i<size;i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter Number whose sum pair you want to find");
        Integer sum = sc.nextInt();

        int[] pairs = getPairForSum(array, sum);
        System.out.println("Pairs are: "+pairs[0]+ " & " +pairs[1]);
    }

    private static int[] getPairForSum(Integer[] inputArray, Integer x) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] pairs = new int[] {0, 0};
        for(int i = 0; i<size;i++) {
            hashMap.put(inputArray[i], i);
        }
        for(int i = 0; i<size;i++) {
            if (hashMap.get(x - inputArray[i])!= null) {
                pairs[0] = inputArray[i];
                pairs[1] = x-inputArray[i];
                return pairs;
            }
        }
        return pairs;
    }
}