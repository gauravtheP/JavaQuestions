package StringsAssignment1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
 * Created by gaurav on 21/6/17.
 */
/*Q2. Write a java program to count the number of times token string appeared in given target string?
	Input: TargetString : java is a programming language. It is mostly used in big data applications
	       TokenString: is
	Output: 2*/
public class Ques2 {
    public static void main(String[] args){
        int count = 0;
        String name = "java is a programming language. It is mostly used in big data applications";
        Pattern pattern = Pattern.compile("is");
        Matcher matcher = pattern.matcher(name);
        while(matcher.find()){
            count++;
        }
        System.out.println("'is' appears "+count+" times");
    }
}
