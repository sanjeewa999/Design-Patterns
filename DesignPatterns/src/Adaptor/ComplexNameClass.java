package Adaptor;

public class ComplexNameClass implements ComplexNameInterface{
    private String lname;
    private String fname;

    @Override
    public String getfname() {
        return fname;
    }

    @Override
    public void setfname(String fname) {
        this.fname=fname;
    }

    @Override
    public String getlname() {
        return lname;
    }

    @Override
    public void setlname(String lname) {
        this.lname=lname;
    }
}

