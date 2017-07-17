/*
 * Created on 17/5/17.
 */
package MiscellaneousJavaPrograms.InsertionSort;

import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[50];
        int size,temp,i,j,k;
        System.out.println("How many Number you want to sort(max 50)");
        size = sc.nextInt();
        System.out.println("Enter Array Elements");
        for(i=1;i<=size;i++){
            ar[i]=sc.nextInt();
        }
        for(j=2;j<=size;j++){
            temp=ar[j];
            k=j-1;
            while(k>0 && ar[k]>temp) //This is while loop.
            {
                ar[k+1]=ar[k];
                k--;
            }
            ar[k+1]=temp;
            System.out.print("Array after pass: ");
            for(i=1;i<=size;i++) {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
        System.out.println("Final Sorted array by Insertion sort is:");
        for(i=1;i<=size;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
