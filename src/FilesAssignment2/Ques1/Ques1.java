package FilesAssignment2.Ques1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*
 * Created by gaurav on 30/6/17.
 */
/*Q1: Write Java program to convert the characters of a file to uppercase?
	Input : Let file contents:
			Use this assignment to learn reading and writing to file
	Output: USE THIS ASSIGNMENTS TO LEARN READING AND WRITING TO FILE*/
public class Ques1 {
    public static void main(String[] args){
        ArrayList<String> text = new ArrayList<>();
        File file = new File("/home/gaurav/Documents/ProjectRepositories/JavaAssignments/src/FilesAssignment2/Ques1/input1.txt");
        File file1 = new File("/home/gaurav/Documents/ProjectRepositories/JavaAssignments/src/FilesAssignment2/Ques1/output1.txt");

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter(file1, false);
            bufferedWriter = new BufferedWriter(fileWriter);

            String content = bufferedReader.readLine();
            while (content != null) {
                if(!content.isEmpty()) {
                    text.add(content);
                }
                content = bufferedReader.readLine();
            }
            String upper;
            for(String words: text) {
                upper = words.toUpperCase();
                bufferedWriter.write(upper);
                bufferedWriter.flush();
            }

        }catch (FileNotFoundException e){
            System.out.println("No File found!!!");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(bufferedReader!=null){
                    bufferedReader.close();
                }
                if(fileReader!=null){
                    fileReader.close();
                }
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
