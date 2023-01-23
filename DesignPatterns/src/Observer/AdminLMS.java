package Observer;

import java.util.Observable;
import java.util.Scanner;

public class AdminLMS extends Observable{
    String lmsMessege;

    Scanner input = new Scanner(System.in);

    public void sendMessege(){
        System.out.println("Please enter the messege to send: ");
        lmsMessege = input.nextLine();

        setChanged();
        notifyObservers();
    }


}
