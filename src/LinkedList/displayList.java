package LinkedList;
//
//class Node {
//    int val;
//    Node next; // by default value Null
//
//    Node(int val) {
//        this.val = val;
//    }
//}
//public class displayList {
//    public static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val+ " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Node a = new Node(100);
//        Node b = new Node(200);
//        Node c = new Node(300);
//        Node d = new Node(400);
//        Node e = new Node(500);
//
//        a.next = b; b.next = c;
//        c.next = d; d.next = e;
//        e.next = null;
//        display(a);
//        System.out.println(get(a, 4));
//
//    }
//
//    private static int get(Node head, int idx) {
//        Node temp = head;
//        for (int i=1; i<=idx; i++) {
//            temp = temp.next;
//        }
//        return head.val;
//    }
//}
