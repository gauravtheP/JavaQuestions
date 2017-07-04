package ArraysAssignments;

/*
 * Created by gaurav on 18/6/17.
 */
/*4. Given an array A[], write a program to print the numbers which are
occuring odd number of times?*/

public class Ques4 {
    public static int findNumber(int [] A){
        int x=0;
        for(int i=0;i<A.length;i++){
            x= x^A[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int[] A = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7};
        System.out.println("Element appearing add number of times: " + findNumber(A));

    }
}

//import java.util.Scanner;
//
//public class Ques4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array Size");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter Array Elements");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//            }
//        for(int i = 0; i<size; i++){
//            for(int j = i+1; j<size; j++){
//               if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.print("Odd occurring elements are: ");
//        int count = 0;
//            for(int j = count+1; j<size; j++){
//                if(arr[count]==arr[j]){
//                    count++;
//                if(arr[count]!=arr[j]) {
//                    if(count % 2==0){
//                        System.out.print(arr[count]+" ");
//                        count++;
//                    }
//                }
//                }
//            }
//    }
//}
