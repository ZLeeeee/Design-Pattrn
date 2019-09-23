package candy.remote;

import candy.GumballMonitor;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    void go(){
        try {
            GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/MyRemote");
            new GumballMonitor(remote).report();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
