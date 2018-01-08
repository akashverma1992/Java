// NestedClass (Non-StaticNestedClass/InnerClass) Example
package demo_nested_classes;

import java.util.Scanner;
import java.util.Arrays;

public class Person {
    private String name, address;
    
    public Person() {
        this.name = this.address = "";
    }

    // InnerClass
    public class Employee {
        private String id;

        public Employee() {}

        public void setID(){
            try (Scanner in = new Scanner(System.in)){
                System.out.print("Enter Name: ");
                Person.this.name = in.nextLine();
                System.out.print("Enter Address: ");
                Person.this.address = in.nextLine();
                System.out.print("Enter ID: ");
                this.id = in.nextLine();
            }
        }

        public String getID() {
            return Arrays.toString(new String[]{"Person Details: " + Person.this.name + ", " + Person.this.address + ", " + this.id});
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        Person.Employee emp = p.new Employee();
        emp.setID();
        System.out.println(emp.getID());
    }
}
