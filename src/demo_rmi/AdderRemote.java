package demo_rmi;

import demo_rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    public static final long serialVersionUID = 0l;

    AdderRemote() throws RemoteException {
        super();
    }

    public Integer add (Integer x, Integer y) throws RemoteException {
        return new Integer((x+y) * 50);
    }
}
