package StringsAssignment1;

/*
 * Created by gaurav on 21/6/17.
 */
/*Q1. Write a java program to remove the space in the given string?
	Input: Ravindra babu ravula
	Output: Ravindrababuravula*/
public class Ques1 {
    public static void main(String[] args){
        String name = "Ravindra babu ravula";
        String[] name2 = name.split("\\s");
        for(String words:name2)
        {
            System.out.print(words);
        }
    }
}
