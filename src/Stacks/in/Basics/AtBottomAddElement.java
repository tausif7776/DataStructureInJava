package Stacks.in.Basics;

import java.util.Stack;

public class AtBottomAddElement {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int ele = 50;

        AtBottomStack(st, ele);

        System.out.println(st);
    }
    public static void AtBottomStack(Stack<Integer> st, int ele) {

        if(st.isEmpty()) {
            st.push(ele);
            return;
        }

        int top = st.pop();
        AtBottomStack(st, ele);
        st.push(top);
    }
}
