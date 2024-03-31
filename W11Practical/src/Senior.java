import java.util.ArrayList;

public class Senior extends Passenger {

    //Declare extra variable unique to the senior subclass
    private double balance;

    //Constructor to instantiate everything
    Senior(String name, int passengerNo, double balance, ArrayList<Activity> activities){

        //Use the superclass's constructor to instantiated inherited attributes
        super(name, passengerNo, activities);

        //Instantiate the attribute unique to this class
        this.balance = balance; 
    } 

    //Public overridden method that prints the details of the object
    public void printDetails(){

        //Use the superclasses printDetails method to print other attributes
        super.printDetails();

        //Print the other attributes
        System.out.println("This passenger has a senior discount");
        System.out.println("Passenger balance: " + this.balance);
    }

    //Public overridden method to sign up to an activity
    public void signUp(Activity activity){

        //Check if the current activity has space left and if the passenger can afford it with the senior discount
        if(activity.getCapacity() > 0 && this.balance >= (activity.getCost() - (0.1*activity.getCost()) )){
            
            //If so then add this activity object to the activiies list, decrease that activities capacity and subract the cost form the passenger's balance with the senior discount of 10%
            this.activities.add(activity);
            this.balance -= (activity.getCost() - ( 0.1*activity.getCost() ));
            activity.signUp();
        }

        //Otherwise if the passenger cannot afford to sign up display appropriate error message
        else if(this.balance < (activity.getCost() - (0.1*activity.getCost()) )){
            System.out.println("Sorry you cannot afford to book this activity.");
        }

        //Otherwise display error message
        else{
            System.out.println("Sorry there are no longer any spaces left on this activity. Please try again later or with another activity.");
        }
    }

    //Getter and setter methods for the unique variables of this subclass
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
