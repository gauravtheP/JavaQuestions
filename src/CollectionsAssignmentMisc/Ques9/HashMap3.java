package CollectionsAssignmentMisc.Ques9;

/*
 * Created by gaurav on 25/6/17.
 */
/*Find four elements a, b, c and d in an array such that a+b = c+d using HashMap?*/

import java.util.HashMap;
import java.util.Scanner;

public class HashMap3 {
    private static int size;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many array elements you want to enter");
        size = sc.nextInt();

        Integer [] array = new Integer[size];
        System.out.println("Enter array Elements");
        for(int i = 0; i<size;i++) {
            array[i] = sc.nextInt();
        }

        int[] numbers = new int[2];
        System.out.println("Enter two numbers from within an array");
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();

        int[] pairs = getPairForSum(array, numbers);

        System.out.println("Sum of "+numbers[0]+ " + "+numbers[1]+" = "+pairs[0]+ " + " +pairs[1]);
    }

    private static int[] getPairForSum(Integer[] inputArray, int[] numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] pairs = new int[] {0, 0};
        for(int i = 0; i<size;i++) {
            hashMap.put(i, inputArray[i]);
        }
        int sumLeft = numbers[0] + numbers[1];

        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if((hashMap.get(i)+hashMap.get(j)) == sumLeft){
                    pairs[0] = hashMap.get(i);
                    pairs[1] = hashMap.get(j);
                    return pairs;
                }
            }
        }
        return pairs;
    }
}
