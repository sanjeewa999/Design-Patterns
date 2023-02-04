package MyFlexiObserverDemo;

//Interface for your Observers
public interface MyObserver {
    //Enabling getting notifications
    //The method you call when a notification is ready
    public void update(String msg);
}
