package demo_this;

public class DemoThis {
    int id;
    String name;

    public DemoThis() {
        this(100, "Aakash");
    }

    public DemoThis(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + " ID: " + this.id + " " + this.getClass());
    }

    public static void main(String[] args) {
        DemoThis obj = new DemoThis();
        System.out.println(obj);
    }
}
