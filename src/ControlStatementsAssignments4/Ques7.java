package ControlStatementsAssignments4;

import java.util.Scanner;

/*
 * Created by gaurav.
 */
/*Q7. (Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.*/
public class Ques7 {
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
        int j = 0;
        double highestScore = Double.NEGATIVE_INFINITY;
        for(int i = 0; i<n; i++){
            if(highestScore<score[i]){
                highestScore = score[i];
                j = i;
            }
        }
        int k = 0;
        double secondHighest = Double.NEGATIVE_INFINITY;
        for(int i = 0; i<n; i++) {
            if (secondHighest < score[i] && i!=j) {
                secondHighest = score[i];
                    k = i;
                }
            }

        System.out.println("Student with highest score is: "+name[j]);
        System.out.println("Student with second highest score is: "+name[k]);
    }
}
