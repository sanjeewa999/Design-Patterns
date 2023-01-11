/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author ASUS
 */
public class SingletonDemo {
    public static void main(String[] args) {

        //  Student student = new Student("saman");
        // Student student2 = new Student("Kamal");
        // System.out.println(student.gender);

        System.out.println("Gender: " + Student.gender);


        EagerSingleton obj1 = EagerSingleton.es;
        EagerSingleton obj2 = EagerSingleton.es;

        System.out.println("obj 1: " + System.identityHashCode(obj1));
        System.out.println("obj 2: " + System.identityHashCode(obj2));


    }
}
