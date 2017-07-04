package CollectionsAssignmentMisc.Ques8;
import java.util.HashMap;
/*
 * Created by gaurav on 25/6/17.
 */
/*Find the maximum occurring character in the given input string using HashMap?
Example :
			Input :"javalanguage"
		    output : a*/

public class HashMap2 {
    public static void main(String[] args){
        String input = "javalanguage";
        System.out.println("Maximum occurring character is '"+getMaxOccurringCharacter(input)+"'");
    }
    public static Character getMaxOccurringCharacter(String str){
        HashMap<Integer, Character > hashMap = new HashMap<>();
        Integer count = 1, maxOccurring = 0;
        Character max = null;
        for(int i = 0; i<str.length(); i++){
            hashMap.put(i, str.charAt(i));
        }
        for(int i = 0; i<hashMap.size(); i++){
            for(int j = i+1; j<hashMap.size(); j++){
                if(hashMap.get(i) == hashMap.get(j)){
                    count++;
                }
                if(count>maxOccurring){
                    max = hashMap.get(i);
                    maxOccurring = count;
                }
            }
            count = 1;
        }
        return max;
    }
}