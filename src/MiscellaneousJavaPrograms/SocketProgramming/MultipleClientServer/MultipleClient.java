/*
 * Created  on 2/6/17.
 */
package MiscellaneousJavaPrograms.SocketProgramming.MultipleClientServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultipleClient {
    public static void main(String[] args)
            throws Exception {
        Socket s = new Socket("localhost", 4445);
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