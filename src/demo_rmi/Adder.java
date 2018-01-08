package demo_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public Integer add(Integer x, Integer y) throws RemoteException;
}