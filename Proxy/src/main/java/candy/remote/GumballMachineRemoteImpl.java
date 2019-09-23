package candy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineRemoteImpl extends UnicastRemoteObject implements GumballMachineRemote{
    private String location;
    public GumballMachineRemoteImpl(String location)throws RemoteException {
        location = location;
    }
    public String getLocation(){
        return location;
    }
}
