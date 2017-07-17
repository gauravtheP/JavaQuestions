/*
 * Created on 31/5/17.
 */
package MiscellaneousJavaPrograms.SerializationDeserialization;
import java.io.*;

class cat implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    transient int password;
    cat(String name, int age, int password){
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
public class TestingSerialization {
    public static void main(String[] args){
        cat c = new cat("Chilli", 3, 23456);
        File file = new File("/home/gaurav/Documents/Java-IntelliJ1/src/SerializationDeserialization/TestSerial.ser");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            fos.close();
            oos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
