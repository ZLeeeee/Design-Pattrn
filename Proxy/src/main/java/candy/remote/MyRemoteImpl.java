package candy.remote;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException{};
    @Override
    public String sayHello(){
        return "Hello World";
    }

    public static void main(String[] args) {
        try {
            MyRemoteImpl myRemote = new MyRemoteImpl();
            Naming.rebind("MyRemoteImpl",myRemote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
