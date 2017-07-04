import java.util.Scanner;
/*
 * Created by gaurav on 4/7/17.
 */
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] Array = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            Array[i] = sc.nextInt();
        }
        sorting(Array, size);
        System.out.print("\nFinal Sorted array: ");
        for(int i = 0; i<size; i++){
            System.out.print(Array[i]+" ");
        }
    }
    private static void sorting(int[] Array, int size){
        int count = 0;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<(size-1)-i; j++){
                if(Array[j]>Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
            count++;
            System.out.print("Array after iteration "+count+":  ");
            for(int k = 0; k<size; k++){
                System.out.print(Array[k]+" ");
            }
            System.out.println();
        }
    }
}
