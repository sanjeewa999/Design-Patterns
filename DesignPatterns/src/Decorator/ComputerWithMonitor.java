package Decorator;

public class ComputerWithMonitor extends ComputerDecorator {
    Computer moniCom;

    public ComputerWithMonitor(Computer com) {
        moniCom = com;

    }

    @Override
    public String description() {
        return moniCom.description() + " and a Monitor";
    }
}