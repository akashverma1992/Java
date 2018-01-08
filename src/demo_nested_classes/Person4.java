// AnonymousClasses (InnerClass) Example
package demo_nested_classes;

import java.util.Scanner;
import java.util.Arrays;

public class Person4 {
    public interface PersonDetails{
        void setID();
        String getID();
    }

    public void createEmployee() {
        class Employee4 implements PersonDetails {
            private String name, address, id;
            public Employee4() {
                name = address = id = "";
            }
            @Override
            public void setID() {
                try (Scanner in = new Scanner(System.in)){
                    System.out.print("Enter Name: ");
                    this.name = in.nextLine();
                    System.out.print("Enter Address: ");
                    this.address = in.nextLine();
                    System.out.print("Enter ID: ");
                    this.id = in.nextLine();
                }
            }
            @Override
            public String getID() {
                return Arrays.toString(new String[]{"Person Details: " + this.name + ", " + this.address + ", " + this.id});
            }
        };
        Employee4 emp = new Employee4();
        emp.setID();
        System.out.println(emp.getID());
    }

    public static void main(String[] args) {
        Person4 p = new Person4();
        p.createEmployee();
    }
}
