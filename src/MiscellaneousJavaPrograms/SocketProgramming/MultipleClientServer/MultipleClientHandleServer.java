/*
 * Created on 2/6/17.
 */
package MiscellaneousJavaPrograms.SocketProgramming.MultipleClientServer;
import java.net.*;
import java.io.*;

public class MultipleClientHandleServer {
    static final int PORT_No = 4445;

    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s;
        System.out.println("Server Listening.......");
        try {
            ss = new ServerSocket(PORT_No);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Server Error");
        }
        while (true) {
            try {
                s = ss.accept();
                System.out.println("Connection Established");
                serverThread st = new serverThread(s);
                st.start();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Connection Error");
            }
        }
    }
}
        class serverThread extends Thread{
            String str = "", str2 = "";
            DataInputStream dis = null;
            DataOutputStream dos = null;
            BufferedReader br = null;
            Socket s = null;
            public serverThread(Socket s){
                this.s = s;
            }
            public void run() {
                try {
                    dis = new DataInputStream(s.getInputStream());
                    dos = new DataOutputStream(s.getOutputStream());
                    br = new BufferedReader(new InputStreamReader(System.in));
                }catch(IOException e){
                    e.printStackTrace();
                    System.out.println("IO Error in Server Thread");
                }
                try {
                    String name;
                    name = dis.readUTF();
                    while (!str.equals("bye")) {
                        str = dis.readUTF();
                        System.out.println(name+" Says: "+str);
                        str2 = br.readLine();
                        dos.writeUTF(str2);
                        dos.flush();
                    }
                }catch(IOException e){
                    str = this.getName();
                    System.out.println("IO Error/Client "+str+" Terminated Abruptly");
                }
                catch(NullPointerException e){
                    str = this.getName();
                    System.out.println("Client "+str+" Closed");
                }finally{
                    try{
                        System.out.println("Connection Closing....");
                        if(dis!=null){
                            dis.close();
                            System.out.println("Input Stream Closed");
                        }
                        if(dos!=null){
                            dos.close();
                            System.out.println("Output Stream Closed");
                        }
                        if(br!=null){
                            br.close();
                            System.out.println("BufferReader is Closed");
                        }
                        if(s!=null){
                            s.close();
                            System.out.println("Socket is Closed");
                        }
                    }catch(IOException e){
                        System.out.println("System closing error");
                    }
                }
            }
        }


