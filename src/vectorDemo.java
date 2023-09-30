import java.util.*;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v =new Vector<>();
        Vector<Integer> v1 = new Vector<>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);
        System.out.println(v.add(50));
        System.out.println(v);
        v.add(0,5);
        System.out.println(v);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);
        System.out.println(v.contains(10));
        System.out.println(v.get(0));
        System.out.println(v.capacity());
    }
}