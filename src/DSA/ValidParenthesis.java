package DSA;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String string = "[{()}]";
        String string1 = "[{(}]";
        int top=-1;
        int c =0;
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<string1.length();i++){
            char a = string1.charAt(i);
            if(a == '(' || a=='[' || a=='{') {
                st.push(a);
                top++;
            }
            else if((a==')' && st.get(top) == '(')||(a==']' && st.get(top) == '[')||(a=='}' && st.get(top) == '{')){
                st.pop();
                top--;
            }else{
                System.out.println("Invalid Parenthesis");
                c =1;
                break;
            }
        }
        if (top == -1 && c==0){
            System.out.println("Valid Parenthesis");
        }
        return;
    }
}
