/*
 * Created on 31/5/17.
 */
package MiscellaneousJavaPrograms.SerializationDeserialization;
import java.io.*;
class TestingDeserialization
{
    public static void main(String[] args)
    {
        cat c = null;
        File file = new File("/home/gaurav/Documents/Java-IntelliJ1/src/SerializationDeserialization/TestSerial.ser");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try
        {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            c = (cat) ois.readObject();       //Type casting
            System.out.println("Name is: "+c.name);
            System.out. println("Age is: "+c.age);
            System.out.println("Password is: "+c.password);
            fis.close();
            ois.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
