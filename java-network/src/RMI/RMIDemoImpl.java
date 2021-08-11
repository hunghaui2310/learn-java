package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemoImpl extends UnicastRemoteObject implements RMIDemo{
    protected RMIDemoImpl() throws RemoteException {
    }

    private static final long serialVersionUID = 1l;

    @Override
    public String hello(String name) throws RemoteException {
        return "Xin chao" + name;
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Naming.rebind("rmi://localhost:5000/hello", new RMIDemoImpl());
        System.out.println("(RMI) Server da san sang");
    }
}
