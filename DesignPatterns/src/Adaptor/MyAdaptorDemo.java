package Adaptor;

public class MyAdaptorDemo {
    public static void main(String[] args) {
        SimpleName sn = new SimpleName();
        sn.setName("Sanjeewa Chathuranga");

        //System.out.println("Name : " + sn.getName());

//        ComplexNameClass cn = new ComplexNameClass();
//        cn.setfname("Sanjeewa");
//        cn.setlname("Chathuranga");
//
//        System.out.println(cn.getfname());
//        System.out.println(cn.getlname());

        SimpeToComplexAdaptor sc = new SimpeToComplexAdaptor(sn);

        System.out.println(sc.getfname());
        System.out.println(sc.getlname());

    }
}
