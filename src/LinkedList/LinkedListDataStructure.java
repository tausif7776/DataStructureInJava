package LinkedList;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class LinkedList {  // user Defined data Structure
    Node head;
    Node tail;
    int size;

    // Add Head Node
    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;

        }
        size++;
    }

    // Add Tail Node
    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // delete Head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert Index
     void insert(int value, int idx) {
        if (idx<0 || idx>size) System.out.println("Invalid Index");
        else if (idx==0) addAtHead(value);
        else if (idx==size) addAtTail(value);
        else {
            Node temp = head;
            for (int i=1; i<=idx-1; i++) {
                temp = temp.next;
            }
            Node t = new Node(value);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    // get Element on index
    int get(int idx) {
        Node temp = head;
        for (int i=1; i<=idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // delete Node
    void delete(int idx) {
        if (idx<0 || idx>=size) {
            System.out.println("invalid index");
            return;
        }
        if (idx==0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for (int i=1; i<=idx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;  // Acutally delete
        if (idx == size-1) tail = temp;
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
//        ll.addAtTail(40); ll.display();
//        ll.addAtHead(50); ll.display();
//        ll.deleteAtHead(); ll.display();
//        System.out.println(ll.size);
        ll.insert(60, 2);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.get(2));
    }
}
