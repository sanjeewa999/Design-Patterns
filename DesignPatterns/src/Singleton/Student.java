/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author ASUS
 */
public class Student {
    String name;
    static String gender="Male";

    private Student(String name) {
        this.name = name;


        //System.out.println("My Name is :"+this.name);
    }
}
