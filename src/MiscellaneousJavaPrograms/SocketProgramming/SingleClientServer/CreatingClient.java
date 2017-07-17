/*
 * Created on 1/6/17.
 */
package MiscellaneousJavaPrograms.SocketProgramming.SingleClientServer;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CreatingClient {
    public static void main(String[] args)
        throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2, name;
        System.out.println("Enter your name");
        name = br.readLine();
        System.out.println("Welcome "+name+".\nThe Connection is Established. You can "+
                "start your chat now.");
        dos.writeUTF(name);
        while (!str1.equals("bye")) {
            str1 = br.readLine();
            dos.writeUTF(str1);
            dos.flush();
            str2 = dis.readUTF();
            System.out.println("Server Says: "+str2);
        }
        s.close();
        dis.close();
        dos.close();
        br.close();
    }
}
//Two files "CreatingServer.java" and "CreatingClient.java". Both
//files are connected via port:3333 which is same.
//This is a chat application.
//First run: CreatingServer.java then run CreatingClient.java.
