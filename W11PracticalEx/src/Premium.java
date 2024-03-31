import java.util.ArrayList;

public class Premium extends Passenger{ 

    //Constructor to instantiate everything
    Premium(String passengerName, int passengerNo, ArrayList<Activity> activities, ArrayList<Ship> cruiseHistory, ArrayList<Activity> activityHistory){

        super(passengerName, passengerNo, activities, cruiseHistory, activityHistory);
    }

    public void printDetails(){
        System.out.println("This passenger has a premium membership");
        super.printDetails();
    }
}
