package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        RMIDemo rmiDemo = (RMIDemo) Naming.lookup("rmi://localhost:5000/hello");
        System.out.println(rmiDemo.hello("Day la RMI Test"));
    }
}
