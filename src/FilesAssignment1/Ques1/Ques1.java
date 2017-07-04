package FilesAssignment1.Ques1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Created by gaurav on 30/6/17.
 */
/*Q1. Write a java program to read a file named input1.txt and store each line of a
file as string in ArrayList ignore the lines which are started with # character
and empty lines?
	Example: Let file input1.txt contains the following contents:
			aaaaa
			abababa
			#acdef
			cabef
			#a

	Output : ArrayList contains only the following data
			aaaaa
			abababa
			cabef
*/
public class Ques1 {

    public static void main(String[] args){
        ArrayList<String> text = new ArrayList<>();
        File file = new File("/home/gaurav/Documents/ProjectRepositories/JavaAssignments/src/FilesAssignment1/Ques1/input1.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String content = br.readLine();
                while (content != null) {
                    if (!content.isEmpty() && content.charAt(0) != '#') {
                        text.add(content);
                    }
                    content = br.readLine();
                }
            for(String words: text) {
                System.out.println(words);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
