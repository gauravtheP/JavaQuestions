/*
 * Created on 22/5/17.
 */
package MiscellaneousJavaPrograms.DoubleLinkedList;

class Doubly{
    Doubly previous;
    String data;
    Doubly next;
    Doubly(Doubly previous, String data, Doubly next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
    public void linking(String data, Doubly db){
        Doubly end = new Doubly(null, data, null);
        Doubly n=db;
        while(n.next!=null){
            n = n.next;
        }
        n.next = end;
        end.previous = n;
        System.out.print(data+"|->");
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {
        Doubly db = new Doubly(null, "Gaurav", null);
        System.out.print(db.data+"|->");
        db.linking("Sharma",db);
        db.linking("Sheenam",db);
        db.linking("Arnold",db);
        db.linking("Schwarznigger",db);
    }
}
