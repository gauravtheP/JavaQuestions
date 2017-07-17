package MiscellaneousJavaPrograms.Synchronization;

/*
 * Created on 11/5/17.
 */
class producer extends Thread{
    int total;
    public void run(){
        synchronized(this)  //Here "this" means the lock acquired from the reference variable
                           //of objects of its own class(producer class).
        {
            total=0;
            for (int i = 1; i <= 100; i++) {
                total = total + i;
            }
            notify();
        }
    }
}
class consumer extends Thread{
    producer p1;
    public consumer(producer p1) 
    {                            
        this.p1 = p1;          
    }                          
    public void run(){         
            synchronized(p1){    
                try{             
                System.out.println("Waiting for Result");
                p1.wait();
            }catch(InterruptedException e){ }
             System.out.println("Value of total is: "+p1.total);
        }
    }
}
public class Synchronization {
    public static void main(String[] args){
        producer p1 = new producer();
        consumer c1 = new consumer(p1);
        c1.start();
        p1.start();
    }
}
