package Decorator;

import jdk.swing.interop.SwingInterOpUtils;

public class MyDecoratorDemo {
    public static void main(String[] args) {
        Computer com = new Computer();
       //System.out.println(com.description());

        com = new ComDVD(com);
        //System.out.println(com.description());

        com = new ComputerWithMonitor(com);
        System.out.println(com.description());
    }
}
    