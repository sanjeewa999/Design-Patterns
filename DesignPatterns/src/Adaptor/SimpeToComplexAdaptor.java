package Adaptor;

public class SimpeToComplexAdaptor implements ComplexNameInterface {
    //This must handle client Request
    //This must convert the client request to backend requrement/request

    SimpleName sn;

    public SimpeToComplexAdaptor(SimpleName sn) {
        this.sn = sn;
        this.fname = sn.getName().split(" ")[0];
        this.lname = sn.getName().split(" ")[1];
    }

    private String fname;
    private String lname;

    @Override
    public String getfname() {
        return fname;
    }

    @Override
    public void setfname(String fname) {
        this.fname = fname;

    }

    @Override
    public String getlname() {
        return lname;
    }

    @Override
    public void setlname(String lname) {
        this.lname = lname;
    }
}
