package LinkedList;

class Node {
    int value;
    Node next;
    Node (int value) {
        this.value = value;
    }
}
public class DisplayLinkedList {
    public static void displayRec(Node head) {
        if (head==null) return;
        System.out.print(head.value+" ");
        display(head.next);
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10); // Node
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
//        display(a);
        displayRec(a);
    }
}
// 120