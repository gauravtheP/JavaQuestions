package MiscellaneousJavaPrograms.Threads;
/*
 * Created on 10/5/17.
 */

//Here we extends java.lang.thread class provided by java lib

class thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    class thread2 extends Thread{
        public void run(){
            for(int k=1; k<=7; k+=2){
                for(int l=1; l<=(7-k)/2; l++){
                    System.out.print(" ");
                }
                for(int m=1; m<=k; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
public class TestingThreadsInJava {
    public static void main(String[] args){
        thread1 t1 = new thread1();
        t1.start();
        System.out.println();
        thread2 t2 = new thread2();
        t2.start();
    }
}
