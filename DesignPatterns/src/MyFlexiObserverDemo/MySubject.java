package MyFlexiObserverDemo;

////Interface for your Subject
public interface MySubject {
    //To register the observers
    public void registerObserver(MyObserver obj);
    //To remove the observers
    public void removeObserver(MyObserver obj);
    //To notify the observser
    public void notifyObservers();
}
