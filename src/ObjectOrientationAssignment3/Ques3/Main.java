package ObjectOrientationAssignment3.Ques3;

import java.util.Scanner;

/*
 * Created by gaurav.
 */
/*Q3. (The MyInteger class) Design a class named MyInteger. The class contains:

 ■ An int data field named value that stores the int value represented by this
   object.
 ■ A constructor that creates a MyInteger object for the specified int value.
 ■ A getter method that returns the int value.
 ■ The methods isEven(), isOdd(), and isPrime() that return true if the
   value in this object is even, odd, or prime, respectively.
 ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
   return true if the specified value is even, odd, or prime, respectively.
 ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
   isPrime(MyInteger) that return true if the specified value is even, odd,
   or prime, respectively.
 ■ The methods equals(int) and equals(MyInteger) that return true if
   the value in this object is equal to the specified value.
 ■ A static method parseInt(char[]) that converts an array of numeric
   characters to an int value.
 ■ A static method parseInt(String) that converts a string into an int
   value.
 Write a client program that tests all methods in the class.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyInteger mi;
        char ch;
        int choice;
        do {
            System.out.println("***************************************************");
            System.out.println("*  What do you want to test                       *");
            System.out.println("*  1 - Testing for Even using isEven(int)         *");
            System.out.println("*  2 - Testing for Odd using isOdd(int)           *");
            System.out.println("*  3 - Testing for Prime using isPrime(int)       *");
            System.out.println("*  4 - Testing for Even using isEven()            *");
            System.out.println("*  5 - Testing for Odd using isOdd()              *");
            System.out.println("*  6 - Testing for Prime using isPrime()          *");
            System.out.println("*  7 - Testing for Even using isEven(MyInteger)   *");
            System.out.println("*  8 - Testing for Odd using isOdd(MyInteger)     *");
            System.out.println("*  9 - Testing for Prime using isPrime(MyInteger) *");
            System.out.println("*  10- Testing for equals(int)                    *");
            System.out.println("*  11- Testing for equals(MyInteger)              *");
            System.out.println("*  12- Testing for parseInt(char[])               *");
            System.out.println("*  13- Testing for parseInt(String)               *");
            System.out.println("*  14- Exit                                       *");
            System.out.println("*  Enter your choice                              *");
            System.out.println("***************************************************");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Testing for Even using isEven(int)");
                    System.out.println("Enter any three numbers");
                    int[] values1 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values1[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values1.length; j++) {
                        System.out.println(values1[j] + "->" + MyInteger.isEven(values1[j]));
                    }
                    break;
                case 2:
                    System.out.println("Testing for Odd using isOdd(int)");
                    System.out.println("Enter any three numbers");
                    int[] values2 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values2[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values2.length; j++) {
                        System.out.println(values2[j] + "->" + MyInteger.isOdd(values2[j]));
                    }
                    break;
                case 3:
                    System.out.println("Testing for Prime using isPrime(int)");
                    System.out.println("Enter any three numbers");
                    int[] values3 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values3[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values3.length; j++) {
                        System.out.println(values3[j] + "->" + MyInteger.isPrime(values3[j]));
                    }
                    break;
                case 4:
                    System.out.println("Testing for Even using isEven()");
                    System.out.println("Enter any three numbers");
                    int[] values4 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values4[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values4.length; j++) {
                        mi = new MyInteger(values4[j]);
                        System.out.println(mi.getter()+ "->" +mi.isEven());
                    }
                    break;
                case 5:
                    System.out.println("Testing for Even using isOdd()");
                    System.out.println("Enter any three numbers");
                    int[] values5 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values5[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values5.length; j++) {
                        mi = new MyInteger(values5[j]);
                        System.out.println(mi.getter()+ "->" +mi.isOdd());
                    }
                    break;
                case 6:
                    System.out.println("Testing for Even using isPrime()");
                    System.out.println("Enter any three numbers");
                    int[] values6 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values6[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values6.length; j++) {
                        mi = new MyInteger(values6[j]);
                        System.out.println(mi.getter()+ "->" +mi.isPrime());
                    }
                    break;
                case 7:
                    System.out.println("Testing for Even using isEven(MyInteger)");
                    System.out.println("Enter any three numbers");
                    int[] values7 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values7[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values7.length; j++) {
                        System.out.println(values7[j] + "->" + MyInteger.isEven(new MyInteger(values7[j])));
                    }
                    break;
                case 8:
                    System.out.println("Testing for Even using isOdd(MyInteger)");
                    System.out.println("Enter any three numbers");
                    int[] values8 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values8[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values8.length; j++) {
                        System.out.println(values8[j] + "->" + MyInteger.isOdd(new MyInteger(values8[j])));
                    }
                    break;
                case 9:
                    System.out.println("Testing for Even using isPrime(MyInteger)");
                    System.out.println("Enter any three numbers");
                    int[] values9 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        values9[i] = sc.nextInt();
                    }
                    for (int j = 0; j < values9.length; j++) {
                        System.out.println(values9[j] + "->" + MyInteger.isPrime(new MyInteger(values9[j])));
                    }
                    break;
                case 10:
                    System.out.println("Testing for equals(int)");
                    System.out.println("Enter any two number");
                    int value10a= sc.nextInt();
                    int value10b = sc.nextInt();
                    mi = new MyInteger(value10b);
                    if(mi.equals(value10a)){
                        System.out.println("Both the objects are equal with values: "+value10a+" & "+value10b);
                    }
                    else{
                        System.out.println("Objects are not equal");
                    }
                    break;
                case 11:
                    System.out.println("Testing for equals(MyInteger)");
                    System.out.println("Enter any one number");
                    int value11a= sc.nextInt();
                    int value11b = sc.nextInt();
                    if(new MyInteger(value11a).equals(new MyInteger(value11b))){
                        System.out.println("Both the objects are equal with values: "+value11a+" & "+value11b);
                    }
                    else{
                        System.out.println("Objects are not equal");
                    }
                    break;
                case 12:
                    System.out.println("Testing for parseInt(char [])");
                        System.out.println("Corresponding Integer representation is: "+MyInteger.parseInt(new char[3]));
                    break;
                case 13:
                    System.out.println("Testing for parseInt(String)");
                    System.out.println("Enter any String");
                    String str = sc.next();
                    System.out.println("Corresponding Integer representation is: "+MyInteger.parseInt(str));
                    break;
                case 14:
                    System.exit(0);
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            System.out.println("Do you want to test again (Y or N)");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}