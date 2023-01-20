package Fazade;

public class DifficultReg {

    //char array to store reg no in TGXXX format

    char regNo[] = new char[5];

    public void setFirstChar(char c){
        regNo[0] = c;
    }

    public void setSecondChar(char c){
        regNo[1] = c;
    }

    public void setThirdChar(char c){
        regNo[2] = c;
    }

    public void setFourthChar(char c){
        regNo[3] = c;
    }

    public void setFifthChar(char c){
        regNo[4] = c;
    }

    public String getRegNo(){
        return new String(regNo);
    }


}
