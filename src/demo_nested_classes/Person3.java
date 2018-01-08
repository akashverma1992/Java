// LocalClass (InnerClass) Example
package demo_nested_classes;

import java.util.Scanner;
import java.util.Arrays;

public class Person3 {
    private String name, address;
    
    public Person3() {
        this.name = this.address = "";
    }

    public void createEmployee() {
        class Employee3 {
            private String id;
            public Employee3() {
                this.id = "";
            }
            public void setID() {
                try (Scanner in = new Scanner(System.in)){
                    System.out.print("Enter Name: ");
                    Person3.this.name = in.nextLine();
                    System.out.print("Enter Address: ");
                    Person3.this.address = in.nextLine();
                    System.out.print("Enter ID: ");
                    this.id = in.nextLine();
                }
            }
            public String getID() {
                return Arrays.toString(new String[]{"Person Details: " + 
                Person3.this.name + ", " + Person3.this.address + ", " + this.id});
            }
        }
        Employee3 emp = new Employee3();
        emp.setID();
        System.out.println(emp.getID());
    }

    public static void main(String[] args) {
        Person3 p = new Person3();
        p.createEmployee();
    }
}
