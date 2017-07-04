package StringsAssignment2;

/*
 * Created by gaurav on 21/6/17.
 */
/*8. Write a java program to reverse words in a given string?
Example : i love raudra and ravindra
		  ravindra and raudra love i*/
public class Ques8 {
    public static void main(String[] args){
        String str = "i love raudra and ravindra";
        String[] str2 = str.split("\\s");
        for(int i = str2.length-1; i>=0; i--){
            System.out.print(str2[i]+" ");
        }
    }
}
