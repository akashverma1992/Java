package demo_collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;

public class DemoArrayList {
    public static void main(String...a){
        HashSet<Object> hs = null;
        TreeSet<Object> ts = null;
        ArrayList<Object> al = null;
        String s[] = {"z", "a", "b", "A", "Z"};
        hs = new HashSet<>();
        ts = new TreeSet<>();
        // al = new ArrayList<>();

        DemoArrayList.addElements(hs, s);
        DemoArrayList.addElements(ts, s);
        // DemoArrayList.addElements(al, s);
        
        al = new ArrayList<>(hs);
        
        System.out.println("HashSet: " + hs);
        System.out.println("ArrayList: " + al);
        System.out.println("TreeSet: " + ts);
    }

    private static void addElements(Collection<Object> c, Object[] o){
        for(Object O : o)
            c.add(O);
    }
}
