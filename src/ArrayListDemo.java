import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        System.out.println(c);
        ArrayList<Integer> al = new ArrayList<>(10);
        al.add(10);
        al.add(20);
        al.set(1,10);
        al.add(2,null);
        al.add(3,30);
        System.out.println(al);
        Object al1 = al.clone();
        System.out.println(al1);

    }
}
