import java.util.*;

public class stackDemo {
    public static void main(String[] args) {
        String s = "udsuh";
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
        Stack<Integer> st =new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        Enumeration<Integer> e = st.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
