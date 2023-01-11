/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author ASUS
 */
public class EagerSingleton {
    //creating an instance
    private static EagerSingleton es = new EagerSingleton();
    private EagerSingleton() {

    }

    //return the only object available

    public static EagerSingleton getInstance(){
        return es;
    }
}
