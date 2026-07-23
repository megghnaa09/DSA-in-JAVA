import java.util.*;
public class stackk {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(80);
        st.push(700);
        st.push(90);
        st.push(69);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek()); 
    }
    
    
    
}
