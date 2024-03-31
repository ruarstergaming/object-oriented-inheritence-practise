import java.util.ArrayList;

public class Passenger {

    //Declare attributes for the passengers name, number and activies they have signed up for
    protected String passengerName;
    protected int passengerNo;
    protected ArrayList<Activity> activities = new ArrayList<>(); 

    //Constructor to instantiate evrything
    Passenger(String passengerName, int passengerNo, ArrayList<Activity> activities){
        this.passengerName = passengerName;
        this.passengerNo = passengerNo;
        this.activities = activities;
    } 

    //Print the detaisl of this passenger
    public void printDetails(){
        
        System.out.println("Passenger Name: " + this.passengerName);
        System.out.println("Passenger Number: " + this.passengerNo);
        System.out.println("Activities " + this.passengerName + " has signed up for:");

        //For loop to print the details for each activity the passenger has signed up for
        for(int i = 0; i < this.activities.size(); i++){
            this.activities.get(i).printDetails();
        }
    }

    //Public method that will sign a passenger up to an activity
    public void signUp(Activity activity){

        //If the activity has space
        if(activity.getCapacity() > 0){

            //Decrease the activity's capacity and add the activity object to the activity list
            this.activities.add(activity);
            activity.signUp();

        }

        //Otherwise print an error message
        else{
            System.out.println("Sorry there are no longer any spaces left on this activity. Please try again later or with another activity.");
        }
    }

    //Getter and setter methos for each attribute
    public String getPassengerName(){
        return this.passengerName;
    }

    public void setPassengerName(String passengerName){
        this.passengerName = passengerName;
    }

    
    public int getPassengerNo(){
        return this.passengerNo;
    }

    public void setPassengerNo(int passengerNo){
        this.passengerNo = passengerNo;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
}