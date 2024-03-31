public class WalkingTour extends Activity{

    //Declare extra variable exclusive to this subclass
    private double distance;

    // Constructor to intialise everything
    WalkingTour(String activityName, String description, double cost, int totalCapacity, int capacity, double distance){
        
        // Use the superclass's constructor to instantiate the inherited variables 
        super(activityName, description, cost, totalCapacity, capacity);

        //Then assign value to new variable
        this.distance = distance;
    }

    //Public method to print the details of this object
    public void printDetails(){

        //Use the superclass's print method an also print the distance
        super.printDetails();
        System.out.println("Distance of walk: " + this.distance);
    }

    //Getter and setter for the distance 
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}