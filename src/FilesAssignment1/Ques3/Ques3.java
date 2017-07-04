package FilesAssignment1.Ques3;

/*
 * Created by gaurav on 30/6/17.
 */
/*Q3: Write a java program to read any .java file and remove comments in it?
	Example: Sample java file
				 /**
				* The HelloWorld program implements an application that
				* simply displays "Hello World!" to the standard output.
				*
				* @author  Zara Ali
				* @version 1.0
				* @since   2014-03-31
public class HelloWorld {

    public static void main(String[] args) {
        // Prints Hello, World! on standard output.
        System.out.println("Hello World!");
    }
}

	Output :
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ques3 {

    public static void main( String[] args ) {
        String source = readFile("/home/gaurav/Documents/ProjectRepositories/JavaAssignments/src/FilesAssignment1/Ques3/sample.java");
        System.out.println(source.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));
    }

    private static String readFile(String fileName) {
        File file = new File(fileName);
        BufferedReader bufferedReader;
        FileReader fileReader;
        char[] text = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            text = new char[(int)file.length()];
            int content = bufferedReader.read();
            int i = 0;
            while(content!=-1) {
                text[i++] = (char) content;
                content = bufferedReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String(text);
    }
}
