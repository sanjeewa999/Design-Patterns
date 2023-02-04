package MyFlexiObserverDemo;

//Driver class to demonstrate
public class MyFlexiObserverDemo {
    public static void main(String[] args) {
        //Create the subject
        TecMisAdmin uthpala = new TecMisAdmin();

        //Create Observers
        Student nimal = new Student("Nimal");
        Student kamala = new Student("Kamala");

        //Register observers
        uthpala.registerObserver(nimal);
        uthpala.registerObserver(kamala);

        //To remove observers
        //uthpala.removeObserver(nimal);
        //uthpala.removeObserver(kamala);

        //Calling the Concrete method of your subject
        uthpala.sendMessage();

    }


}
