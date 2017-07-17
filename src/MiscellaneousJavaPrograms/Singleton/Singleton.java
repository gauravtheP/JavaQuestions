package MiscellaneousJavaPrograms.Singleton;

/*
 * Created on 6/5/17.
 */
public class Singleton {
    private static Singleton instance;  //reference variable declared of type class Singleton.
                                        //A Class is a user-defined data type. Hence, here
                                        //instance is a variable declared of class Singleton
                                        //data-type.
          private Singleton()           //Constructor of class singleton
          {
              System.out.println("Object is created");
          }
          static{                          //In Static block object is created
              instance = new Singleton(); //as soon as class is loaded.
          }
          public static Singleton getObject(){
              return instance;
    }
    public static void main(String args[]){
              Singleton.getObject();      
    }                                     
}                                         

//One disadvantage of this code is that unnecessary one object will always be created
//as soon as class is loaded because the object is created inside static block.
