package Stacks.in.Basics;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class  MyStack {
    Node head;
    int len;

    // peak
    int peak() {
        if (head == null) {
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return head.val;
    }

    // pop
    int pop() throws Exception {
        if (head == null) {
            throw new Exception("Stack Underflow!");
        }
        int x = head.val;
        head = head.next;
        return x;
    }

    // push
    void push(int ele) {
        Node temp = new Node(ele);
        if(len == 0) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }

    // size
    int size() {
        return len;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListImplementationOfStack {
    public static void main(String[] args) throws Exception {

        MyStack ms = new MyStack();

        /*
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);

        ms.display();

        ms.pop();
        ms.display();

        System.out.println(ms.size());

         */

        ms.pop();
        ms.display();
    }
}
