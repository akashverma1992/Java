// Demo ClassCastException

package democce;

public class DemoCCE {
    public static void main(String...args){
        Object o = new Object();
        String s = "String";
        System.out.println(o);
        System.out.println(s);
        // o = s;
        // System.out.println(o);
        // s = (String) o;
        s = o.toString();
        System.out.println(s);
        Object o2 = new String("String 2!");
        s = (String) o2;
        System.out.println(s);
    }
}
