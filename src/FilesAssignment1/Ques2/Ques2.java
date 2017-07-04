package FilesAssignment1.Ques2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Created by gaurav on 30/6/17.
 */
/*Q2:  Write a java program to check whether the string prefix matches the any one
of the prefixes mentioned in the file prefix-urlfilter.txt?

	Note : The format of this file is one URL prefix per line.
		Let File contents are
		http://
		https://
		ftp://
		file://
	Input1:  http://www.example.com/
	Output1: true
	Input2: https://www.example.com/
	Output2: true
       	Input3:  ftp://www.example.com/
	Output3: true
	Input4: file://www.example.com/
	Output4: true
       	Input5 : abcd://www.example.com/
	Output5: false*/
public class Ques2 {

    private static ArrayList<String> readingContent(){
        ArrayList<String> text = new ArrayList<>();
        File file = new File("/home/gaurav/Documents/ProjectRepositories/JavaAssignments/src/FilesAssignment1/Ques2/prefix-urlfilter.txt");
        FileReader FR = null;
        BufferedReader BR = null;
        try{
            FR = new FileReader(file);
            BR = new BufferedReader(FR);
            String content = BR.readLine();
            while (content!=null){
                if (!content.isEmpty()){
                    text.add(content);
                    content = BR.readLine();
                }
            }
            return text;

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(BR!=null){
                    BR.close();
                }
                if(FR!=null){
                    FR.close();
                }
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return text;
    }

    private static boolean matching(String input, ArrayList<String> match){
        int flag = 0;

        for(String words:match){
            if(input.startsWith(words)){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter URL for matching");
            String input = sc.next();

            ArrayList<String> match = readingContent();
            boolean check = matching(input ,match);

            System.out.println("Value match: "+check);

            System.out.println("Do you want to do more transaction: Y or N\n");
            ch = sc.next().charAt(0);
    }while(ch=='Y'||ch=='y');
    }
}
