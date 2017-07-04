package CollectionsAssignmentMisc.Ques1;
import java.util.HashSet;
/*
 * Created by gaurav on 25/6/17.
 */
/*Consider a set of strings, write a java program to find the number duplicate
using HashSet?
	Example : Input : {"raudra", "ravi", "java", "ravula", "ravi", "ravula"}
			  Output : 2  */

public class DuplicateHashSet {
        private static int countNumberOfDuplicates(String[] inputSet) {
            int count = 0;
            HashSet<String> stringHashSet = new HashSet<>();
            for (String inputString : inputSet) {
                if (!stringHashSet.add(inputString)) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String[] inputSet =  {"raudra", "ravi", "java", "ravula", "ravi", "ravula"};
            System.out.println(countNumberOfDuplicates(inputSet));
        }
    }