package ControlStatementsAssignments4;
import java.util.Scanner;
/*
 * Created by gaurav.
 */
/*Q6. (Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.
*/
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students information you want to enter");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter Name and score of student");
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }
        int j = 0, highestScore = score[0];
        for(int i = 0; i<n; i++){
            if(highestScore<score[i]){
                highestScore = score[i];
                j = i;
            }
        }
        System.out.println("Student with highest score is: "+name[j]);
    }
}
