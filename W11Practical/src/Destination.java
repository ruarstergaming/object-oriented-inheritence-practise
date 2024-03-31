import java.util.ArrayList;

public class Destination {

    //Declare attributes for the destanation name and its activity list
    private String destinationName;
    private ArrayList<Activity> activities = new ArrayList<>();

    //Constructor that instantiates everything
    Destination(String destinationName, ArrayList<Activity> activities){
        this.destinationName = destinationName;
        this.activities = activities;
    }

    //Public method to print details of this destination
    public void printDetails(){

        System.out.println("Destination Name: " + this.destinationName);

        System.out.println("Activities:");

        //For loop to print the details of each activity in the list
        for(int i = 0; i < this.activities.size(); i++){
            this.activities.get(i).printDetails();
        }
    }

    //Public method that prints the details of each activity in the destination that has space left
    public void printAvailaibleActivities(){

        //For loop tht checks each activity in the list
        for(int i = 0; i < this.activities.size(); i++){
        
            //If the activity has space left then print that activity's details
            if(this.activities.get(i).getCapacity() > 0){
                this.activities.get(i).printDetails();
            }
            
        }

    }

    //Getter and setter methods for each attribute
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
}
