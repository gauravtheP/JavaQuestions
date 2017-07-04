/*
 * Created by gaurav.
 */
//Q4. (Summation of a series) Write a program that displays the result of
//				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.

package IntroductionAssignment;
public class Ques4 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i<=8; i++){
            sum = sum+i;
            System.out.print(i+"+");
        }
        System.out.print("9 = ");
        System.out.print(sum+9);

    }
}
