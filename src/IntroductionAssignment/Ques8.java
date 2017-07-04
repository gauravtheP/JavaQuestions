/*
 * Created by gaurav.
 */
/*Q8. (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)*/
package IntroductionAssignment;
public class Ques8 {
    public static void main(String[] args){
        double distance = 38.4;        //24miles distance in km
        double time = 1.676388889;     //1hr, 40min and 35sec in hr
        double speed=distance/time;
        System.out.println("Average Speed is: "+speed+" km/hr");
    }
}
