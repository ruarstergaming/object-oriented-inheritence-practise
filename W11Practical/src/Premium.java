import java.util.ArrayList;

public class Premium extends Passenger{ 

    //Constructor to instantiate everything
    Premium(String passengerName, int passengerNo, ArrayList<Activity> activities){

        super(passengerName, passengerNo, activities);
    }

    public void printDetails(){
        System.out.println("This passenger has a premium membership");
        super.printDetails();
    }
}
