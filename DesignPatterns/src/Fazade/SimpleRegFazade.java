package Fazade;

public class SimpleRegFazade {

    DifficultReg dr;

    public SimpleRegFazade() {
        this.dr = new DifficultReg();
    }

    public void setRegNo(String regNo){


        char[] reg = regNo.toCharArray();

        if(reg.length > 0)
            dr.setFirstChar(reg[0]);
        if(reg.length>1)
            dr.setThirdChar(reg[1]);
        if(reg.length>2)
            dr.setFourthChar(reg[2]);
        if(reg.length>3)
            dr.setFourthChar(reg[3]);
        if(reg.length>4)
            dr.setFifthChar(reg[4]);

    }

    public String getRegNo(){
        return dr.getRegNo();
    }
}
