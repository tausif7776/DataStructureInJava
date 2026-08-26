package Stacks.in.Basics;

import java.util.Stack;

public class BasicStackDemo {
    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

//        System.out.println(st.pop());
//        System.out.println(st.size() == 0);
        System.out.println(st.isEmpty());

        st.add("John");
        st.add("Bob");
        st.add("Charlie");
        st.add("David");

//        System.out.println(st.pop());
//        System.out.println(st.peek());

//        System.out.println(st.size());
//
//        System.out.println(st);
//
//        st.pop();
//        System.out.println(st);
    }
}
