package demo_rmi;

import demo_rmi.*;
import java.rmi.*;
import java.net.MalformedURLException;

public class MyClient {
    public static void main(String...args) {
        try {
            Adder stub = MyClient.toAdder(args);
            System.out.println(stub.add(20, 30));
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Adder toAdder(String...args) 
        throws NotBoundException, MalformedURLException, RemoteException
    {
        String url = "rmi://localhost:" + args[0] + "/aakash";
        Adder adder = (Adder) Naming.lookup(url);
        return adder;
    }
}
