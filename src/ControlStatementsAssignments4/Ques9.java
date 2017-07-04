package ControlStatementsAssignments4;

/*
 * Created by gaurav.
 */
/*Q9. (Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
integer n such that n^3 is less than 12,000.*/
public class Ques9 {
    public static void main(String[] args) {
        int n = 1;
        while(Math.pow(n,3)<12000){
            n=n+1;
        }
        n=n-1;
        System.out.println("Largest n^3 <12000 is: "+n);
    }
}
