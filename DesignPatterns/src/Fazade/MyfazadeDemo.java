package Fazade;

import java.util.Scanner;

public class MyfazadeDemo {
    public static void main(String[] args) {
//        DifficultReg dr = new DifficultReg();

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your First character: ");
//        dr.setFirstChar(input.next().charAt(0));
//
//        System.out.println("Enter your Second character: ");
//        dr.setSecondChar(input.next().charAt(1));
//
//        System.out.println("Enter your Third character: ");
//        dr.setThirdChar(input.next().charAt(2));
//
//        System.out.println("Enter your Fourth character: ");
//        dr.setFourthChar(input.next().charAt(3));
//
//        System.out.println("Enter your Fifth character: ");
//        dr.setFifthChar(input.next().charAt(4));

        SimpleRegFazade srFazade = new SimpleRegFazade();

        System.out.println("Enter your Reg No: ");
        srFazade.setRegNo(input.next());

        System.out.println(srFazade.getRegNo());
    }

}
