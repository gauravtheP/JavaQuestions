package StringsAssignment2;
import java.util.Scanner;
/*
 * Created by gaurav on 21/6/17.
 */
/*4. Given a string s1
and a string s2, write a java method to say whether s2 is a rotation of s1 ?
	Example : given s1 = abcd and s2 = cdab, return true, given s1 = abcd, and
	s2 = acbd , return false*/
public class Ques4{
    public static boolean testingRotation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.next();
        System.out.println("Enter Second String");
        String str2 = sc.next();
        String concat = str1.concat(str1);
        System.out.println(concat);
        return (str1.length()==str2.length()) && (concat.contains(str2));
    }
    public static void main(String args[]){
        if(Ques4.testingRotation()){
            System.out.println("S2 is a rotation of s1");
        }
        else{
            System.out.println("S2 is not a rotation of s1");
        }
    }
}