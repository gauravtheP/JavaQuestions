package StringsAssignment2;
import java.util.Scanner;

/*
 * Created by gaurav on 21/6/17.
 */
/*9. Given a string, find its first non-repeating character?
	Example : Given String : ravindra
					Output : v*/
public class Ques9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        char[] arr = new char[str.length()];

        for(int j=0; j<arr.length; j++)
        {
            arr[j] = str.charAt(j);
        }
        char found = searchChar(arr);
        System.out.println("The first non repeated char is: "+found);
    }

    private static char searchChar(char[] a) {
        int flag = 0;
        for(int i = 0; i<a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        flag = 1;
                        break;
                    }
                    if (a[i] != a[j]) {
                        flag = 0;
                    }
                    if (flag == 0 && j == a.length - 1) {
                        return a[i];
                    }
                }
            }
        }
        return a[a.length-1];
    }
}