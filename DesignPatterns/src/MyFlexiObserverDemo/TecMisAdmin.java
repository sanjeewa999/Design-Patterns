package MyFlexiObserverDemo;

import java.util.ArrayList;
import java.util.Scanner;

//Concrete Subject
public class TecMisAdmin implements MySubject{
    //private MyObserver stu;
    private ArrayList<MyObserver> students = new ArrayList<>();
    private String msg;
    private Scanner input = new Scanner(System.in);
    @Override
    public void registerObserver(MyObserver obj) {
        //stu = obj;
        students.add(obj);
    }

    @Override
    public void removeObserver(MyObserver obj) {
        //stu = null;
        students.remove(obj);
    }

    @Override
    public void notifyObservers() {
        //stu.update(msg);
        for(MyObserver stu:students)
            stu.update(msg);
    }

    //your concrete custom method
    public void sendMessage(){
        System.out.println("Please enter your message to send : ");
        msg = input.nextLine();
        notifyObservers();
    }
}
