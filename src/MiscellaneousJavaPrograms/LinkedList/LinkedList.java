/*
 * Created on 28/5/17.
 */
package MiscellaneousJavaPrograms.LinkedList;
import java.util.Scanner;

class Nodes {
    int data;
    Nodes next = null;

    public Nodes(int data) {
        this.data = data;
    }
}

class linking {
    Nodes start = null;
    Nodes n = null;
    int size = 0;

    public void insertAtBegin(int value) {
        Nodes newNode = new Nodes(value);
        size++;
        if (start == null) {
            start = newNode;
            newNode.next = null;
            }
            else {
                n = start;
                start = newNode;
                newNode.next = n;
            }
        }

        public void insertAtPosition(int value, int pos){
        if(pos<1 || pos>=size+2){
            System.out.println("Invalid Position");
        }

        if(pos==1){
            Nodes newNode = new Nodes(value);
            size++;
            if (start == null) {
                start = newNode;
                newNode.next = null;
            }
            else {
                n = start;
                start = newNode;
                newNode.next = n;
            }
        }

        if((pos>1 && pos<=size) || (pos==size+1)){
            Nodes newNode = new Nodes(value);
            size++;
            Nodes p;
            n = start;
            p = start;
            for(int i = 1; i<pos; i++){
                n = n.next;
            }
            for(int j = 1; j<pos-1;j++){
                p = p.next;
            }
            p.next = newNode;
            newNode.next = n;
        }
    }

    public void insertAtEnd(int value) {
        Nodes newNode = new Nodes(value);
        size++;
        if (start == null) {
            start = newNode;
            newNode.next = null;
            }
            else {
            n = start;
            while(n.next!=null){
                n=n.next;
                }
            n.next = newNode;
            newNode.next = null;
            }
        }

        public void deleteAtPosition(int pos){
            if(size==0){
                System.out.println("List is already Empty");
            }
            if(pos<0 || pos>size){
                System.out.println("Invalid Position");
            }
            if(pos==0){
                System.out.println("Invalid Position");
            }
            if(size==1){
                start = null;
                size--;
                System.out.println("List is Empty now");
            }
            if(size>1) {
                if (pos == 1) {
                    n = start;
                    start = n.next;
                    size--;
                    display();
                }
            }
            if(pos>1 && pos<=size){
                    Nodes p;
                    n = start;
                    p = start;
                    for (int i = 1; i <= pos; i++) {
                        n = n.next;
                    }
                    for (int j = 1; j < pos - 1; j++) {
                        p = p.next;
                    }
                    p.next = n;
                    size--;
                    display();
            }
        }

    public int getSize()
        {
            return size;
        }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void display() {
        n = start;
        if (size == 0) {
            System.out.println("List is Empty");
        }
        if (size >= 1) {
            System.out.print("Linked list is = ");
            while (n.next != null) {
                System.out.print(n.data + "->");
                n = n.next;
            }
            System.out.print(n.data);
        }
    }
}

public class LinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linking list = new linking();
        char ch;
        do {
            System.out.println("Linked List");
            System.out.println("1- Insert at the beginning");
            System.out.println("2- Insert at a Position");
            System.out.println("3- Insert at the end");
            System.out.println("4- Delete at a position");
            System.out.println("5- Size of Linked List");
            System.out.println("6- Check Empty");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value you want to insert");
                    list.insertAtBegin(sc.nextInt());
                    list.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the value you want to insert");
                    int value = sc.nextInt();
                    System.out.println("Enter the position where you want to insert");
                    int pos = sc.nextInt();
                    list.insertAtPosition(value, pos);
                    list.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the value you want to insert");
                    list.insertAtEnd(sc.nextInt());
                    list.display();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the position where you want to delete");
                    list.deleteAtPosition(sc.nextInt());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Size = " +list.getSize());
                    break;
                case 6:
                    System.out.println("Empty status = "+ list.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n");
                    break;
            }
            System.out.println("Do you want to continue(Type y or n)\n");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}