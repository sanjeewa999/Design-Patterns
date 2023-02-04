package MyFlexiObserverDemo;

//Concrete Observer
public class Student implements MyObserver{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("I'm "+this.name+" I got the Message : " + msg);
    }
}
