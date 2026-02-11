package DSA;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(3);
        st.push(15);
        st.push(16);
        for(int a : st){
            System.out.print(a+" ");
        }
    }
}
