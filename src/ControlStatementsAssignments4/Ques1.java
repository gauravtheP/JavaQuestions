package ControlStatementsAssignments4;
import java.util.Random;
/*
 * Created by gaurav.
 */
/*Q1 : (Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, …, December for
the number 1, 2, …, 12, accordingly.*/

public class Ques1 {
    public static void main(String[] args){
        Random random = new Random();
            int ran = random.nextInt(12)+1;
        if(ran==1){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: January");
        }
        if(ran==2){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: February");
        }
        if(ran==3){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: March");
        }
        if(ran==4){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: April");
        }
        if(ran==5){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: May");
        }
        if(ran==6){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: June");
        }
        if(ran==7){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: July");
        }
        if(ran==8){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: August");
        }
        if(ran==9){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: September");
        }
        if(ran==10){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: October");
        }
        if(ran==11){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: November");
        }
        if(ran==12){
            System.out.println("Random number is: "+ran);
            System.out.println("Month is: December");
        }
        }
    }
