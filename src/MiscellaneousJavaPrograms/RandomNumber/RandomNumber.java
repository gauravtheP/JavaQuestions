package MiscellaneousJavaPrograms.RandomNumber;

import java.util.Random;
/*
 * Created on 13/6/2017.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int ran = random.nextInt(12) + 1;
        System.out.println("Random number is: "+ran);
    }
}
//This is a program to generate random number in the range 1 to 12.