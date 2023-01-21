package Decorator;

public class ComDVD extends ComputerDecorator{
    Computer dvdCom;

    public ComDVD(Computer com) {
        dvdCom = com;

    }

    @Override
    public String description() {
        return dvdCom.description() + " and a DVD";
    }
}
