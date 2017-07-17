/*
 * Created on 1/6/17.
 */
package MiscellaneousJavaPrograms.SocketProgramming.SingleClientServer;
import java.net.*;
import java.io.*;

public class CreatingServer {
    public static void main(String[] args)
            throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "",str2, name;
        name = dis.readUTF();
        while(!str1.equals("bye")){
            str1 = dis.readUTF();
            System.out.println(name+" says: "+str1);
            str2 = br.readLine();
            dos.writeUTF(str2);
            dos.flush();
        }
        ss.close();
        s.close();
        dis.close();
        dos.close();
        br.close();
    }
}
//Two files "CreatingServer.java" and "CreatingClient.java". Both are
//files are connected via port:3333 which is same.
//This is a chat application.
//First run: CreatingServer.java then run CreatingClient.java.
