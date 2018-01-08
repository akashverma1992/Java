// NesedClass (StaticNestedClass) Example
package demo_nested_classes;

import java.util.Scanner;
import java.util.Arrays;

public class Person2 {
    private static String name, address;
    
    static {
        name = address = "";
    }

    static public class Employee2 {
        private String id;

        public Employee2() {
            this.id = "";
        }

        public void setID(){
            try (Scanner in = new Scanner(System.in)){
                System.out.print("Enter Name: ");
                Person2.name = in.nextLine();
                System.out.print("Enter Address: ");
                Person2.address = in.nextLine();
                System.out.print("Enter ID: ");
                this.id = in.nextLine();
            }
        }

        public String getID() {
            return Arrays.toString(new String[]{"Person Details: " + Person2.name + ", " + Person2.address + ", " + this.id});
        }
    }

    public static void main(String[] args) {
        Person2.Employee2 emp = new Person2.Employee2();
        emp.setID();
        System.out.println(emp.getID());
    }
}