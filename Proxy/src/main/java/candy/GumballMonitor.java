package candy;

import candy.remote.GumballMachineRemote;

public class GumballMonitor {
    public GumballMonitor(GumballMachineRemote machine){
        gumballMachine = machine;
    }
    private GumballMachineRemote gumballMachine;
    public void report(){
        try {

            System.out.println("gumballMachine location: "+gumballMachine.getLocation());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
