package candy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    String getLocation() throws RemoteException;
}
