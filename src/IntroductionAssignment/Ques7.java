/*
 * Created by gaurav.
 */
/*Q7.(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)*/

package IntroductionAssignment;
public class Ques7 {
    public static void main(String[] args){
        double distance = 8.75;            //14 km distance in miles
        double time = 0.758333333;         //45min and 30 sec time in hours
        double speed = distance/time;
        System.out.println("Speed is: "+speed+" miles/hr");
    }
}
