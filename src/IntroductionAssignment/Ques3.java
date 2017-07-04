/*
 * Created by gaurav.
 */
/*Q3. (Print a table) Write a program that displays the following table:
a	 a^2    a^3
1	 1 		        1
2	 4 		        8
3	 9 		        27
4	 16     64*/

package IntroductionAssignment;
public class Ques3 {
    public static void main(String[] args){
        System.out.println("a"+"\t\t\t"+"a^2"+"\t\t\t"+"a^3");
        for(int i = 1; i<=3; i++){
            System.out.println(i+"\t\t\t"+(int)Math.pow(i,2)+"\t\t\t\t\t\t"+(int)Math.pow(i,3));
        }
        System.out.println(4+"\t\t\t"+(int)Math.pow(4,2)+"\t\t\t"+(int)Math.pow(4,3));
    }
}
