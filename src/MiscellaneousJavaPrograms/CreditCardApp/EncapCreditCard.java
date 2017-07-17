/*
 * Created on 4/5/17.
 */
package MiscellaneousJavaPrograms.CreditCardApp;
import java.util.Scanner;

class CreditCardNumber{
    private int Number=98765;
    public int CompareNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Credit Card Number");
        int CCNumber2 = sc.nextInt();
        if(Number==CCNumber2){
            return 1;
        }
        else{
            System.out.println("Enter your Credit Card Number again");
            int CCNumber3 = sc.nextInt();
            if(Number==CCNumber3){
                return 1;
            }
            else{
                System.out.println("Enter your Credit Card Number again");
                int CCNumber4 = sc.nextInt();
                if(Number==CCNumber4){
                    return 1;
                }
                else{
                    System.out.println("You have exceeded the maximum number of attempts");
                    return 0;
                }
            }
        }
    }
}

class CreditCardPin{
    private int pin=1234;
    public int ComparePINNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN Number");
        int CCPinNumber2 = sc.nextInt();
        if(pin==CCPinNumber2){
            return 1;
        }
        else{
            System.out.println("Enter PIN Number again");
            int CCPinNumber3 = sc.nextInt();
            if(pin==CCPinNumber3){
                return 1;
            }
            else{
                System.out.println("Enter PIN Number again");
                int CCPinNumber4 = sc.nextInt();
                if(pin==CCPinNumber4){
                    return 1;
                }
                else{
                    System.out.println("You have exceeded the maximum number of attempts");
                    return 0;
                }
            }
        }
    }
}

class BalanceAmount{
    private int balance=40000;
    public int CompareBalanceAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount you want to withdraw");
        int AmountWithdraw = sc.nextInt();
        if(balance<AmountWithdraw){
            System.out.println("Balance is less. Enter lesser amount");
            int AmountWithdraw1 = sc.nextInt();
            if(balance<AmountWithdraw1){
                System.out.println("Balance is less. Enter lesser amount");
                int AmountWithdraw2 = sc.nextInt();
                if(balance<AmountWithdraw2){
                    System.out.println("You have exceeded the maximum number of attempts");
                }
                else{
                    System.out.println("Withdraw Successful");
                    return 0;
                }
            }
            else{
                System.out.println("Withdraw Successful");
                return 0;
            }
        }
        else{
            System.out.println("Withdraw Successful");
            return 0;
        }
        return 0;
    }
}

public class EncapCreditCard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            CreditCardNumber CCNumber = new CreditCardNumber();
            int temp1 = CCNumber.CompareNumber();
            if (temp1 == 1) {
                CreditCardPin CCPin = new CreditCardPin();
                int temp2 = CCPin.ComparePINNumber();
                if (temp2 == 1) {
                    BalanceAmount BA = new BalanceAmount();
                    BA.CompareBalanceAmount();
                }
            }
            System.out.println("Do you want to do more transaction: Y or N");
            ch = sc.next().charAt(0);       //this will take first character only
        }while(ch=='Y'||ch=='y');
    }
}
