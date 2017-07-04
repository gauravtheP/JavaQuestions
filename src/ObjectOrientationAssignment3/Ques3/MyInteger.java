package ObjectOrientationAssignment3.Ques3;

import java.util.Scanner;

/*
 * Created by gaurav on 17/6/17.
 */
public class MyInteger {
    private int value;

    protected MyInteger(int value) {
        this.value = value;
    }

    protected int getter() {
        return value;
    }

    protected static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean isEven() {
        return isEven(value);
    }

    protected static boolean isEven(MyInteger mi) {
        return mi.isEven();
    }

    protected static boolean isOdd(int value) {
        if (value % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    protected boolean isOdd() {
        return isOdd(value);
    }

    protected static boolean isOdd(MyInteger mi) {
        return mi.isOdd();
    }

    protected static boolean isPrime(int value) {
        int temp = 0;
        for (int i = 2; i <= (value / 2); i++) {
            if (value % i == 0) {
                temp = 1;
                break;
            }
        }
        if (temp == 1) {
            return false;
        } else {
            return true;
        }
    }

    protected boolean isPrime() {
        return isPrime(value);
    }

    protected static boolean isPrime(MyInteger mi) {
        return mi.isPrime();
    }

    protected boolean equals(int value) {
        return this.value == value;
    }

    protected boolean equals(MyInteger mi) {
        return this.value == mi.value;
    }

    protected static int parseInt(char[] chars) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numeric characters");
        for (int i = 0; i < 3; i++) {
            chars[i] = sc.next().charAt(0);
        }
        int value = 0;
        int j = (int) Math.pow(10, chars.length - 1);
        for (int i = 0; i < chars.length; i++) {
            value = value + (chars[i] - 48) * j;
            j = j / 10;
        }
        return value;
    }

    protected static int parseInt(String str) {
        int value = 0;
        int j = (int) Math.pow(10, str.length() - 1);
        for (int i = 0; i < str.length(); i++) {
            value = value + (str.charAt(i) - 48) * j;
            j = j / 10;
        }
        return value;
    }
}
