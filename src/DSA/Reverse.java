package DSA;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String  a= "abcd";
        String b="";
        Stack<Character> st = new Stack<>();
        for(int i =0;i<a.length();i++){
            st.push(a.charAt(i));
        }
        while(!st.empty()){
            b+=st.pop();
        }
        System.out.println(b);
    }
}
