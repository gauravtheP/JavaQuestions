package ControlStatementsAssignments4;

/*
 * Created by gaurav.
 */
/*Q8. (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.*/
public class Ques8 {
    public static void main(String[] args) {
        int flag=0;
        for(int i = 100; i<=1000; i++){
            if((i%5==0) && (i%6==0)){
                flag++;
                System.out.print(i+" ");
                if(flag%10==0){
                    System.out.println();
                }
            }
        }
    }
}
