import java.util.*;

public class hashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht1 = new Hashtable<>();
        ht1.put("vinay",1);
        ht1.put("vinay1",5);
        ht1.put("vinay2",30);
        ht1.put("vinay3",40);
        ht1.put("vinay",10);
        Enumeration<String> e = ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(ht1.get("vinay"));
        Collection<Integer> c = ht1.values();
        System.out.println(c);
        System.out.println(ht1);
        System.out.println(ht1.size());

    }
}
