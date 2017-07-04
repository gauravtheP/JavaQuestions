package FilesAssignment2.Ques2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Created by gaurav on 30/6/17.
 */
/*Q2: Write a java code to delete the words from a string that are prsent in a file
 named stopwords.txt?
Note: stopwords.txt contains the words as comma seperated
Example stopwords.txt: a,able,about,across,after,all,almost,the,to,is

Input: TextString : This is Java assignment helps you to understand the files.
       stopwords.txt: a,able,about,across,after,all,almost,the,to,is,this
Output: Java assignment helps understand files

Hint: Try to load the stopwords.txt in to HashSet and chack every word of string
present in the HashSet if present remove the word.
Use the split method of string to tokenize the stopwords.txt file lines with ,
*/
public class Ques2 {

    public static void main(String[] args){
        ArrayList<String> text = new ArrayList<>();
        HashSet<String> hashset = new HashSet<>();
        File file = new File("/home/gaurav/Documents/ProjectRepositories/JavaAssignments/src/FilesAssignment2/Ques2/stopwords.txt");

        FileReader fr = null;
        BufferedReader br = null;
        String input = "This is Java assignment helps you to understand the files";
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String content = br.readLine();
            while (content != null) {
                if (!content.isEmpty()) {
                    text.add(content);
                }
                content = br.readLine();
            }
            String str = null;
            for(String words: text) {
                str = words;
            }
            String[] str2 = null;
            for(int i = 0; i<str.length(); i++){
                str2 = str.split("\\,");
            }
            for(String str3: str2){
                hashset.add(str3);
            }

            //For input String
            String[] input1 = null;
            for(int i = 0; i<input.length(); i++){
                input1 = input.split("\\s");
            }

            for(String input2: input1){
                if(hashset.add(input2)){   //Hashset does not accept duplicates.
                                           //So, Only those words will be added
                                           //which are not present in str3 means in
                                           //file stopwords.txt.
                    System.out.print(input2+" ");
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
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