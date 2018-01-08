package demo_rmi;

import demo_rmi.*;
import java.rmi.*;
import java.rmi.server.*;

public class MyServer {
    public static void main(String...args) {
        try {
            Adder stub = new AdderRemote();
            String rebindURL = "rmi://localhost:" + args[0] + "/aakash";
            Naming.rebind(rebindURL, stub);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
