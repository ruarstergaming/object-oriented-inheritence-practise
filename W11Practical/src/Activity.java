public class Activity {

    //Declared protected variables so subclasses can use them with details of generic activities
    protected String activityName;
    protected String description;
    protected double cost;
    protected int totalCapacity;
    protected int capacity;

    //Constructor to instantiate all attributes
    Activity(String activityName, String description, double cost,  int totalCapacity, int capacity){
        this.activityName = activityName;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    //Public method that prints out the details of the activity
    public void printDetails(){
        System.out.println("Activity name: " + this.activityName);
        System.out.println("Description of activity: " + this.description);
        System.out.println("Activity cost: " + this.cost);
        System.out.println("Activity total capacity:" + this.totalCapacity);
        System.out.println("Activity current capacity: " + this.capacity);
    }
    
    //Public method that decreases the current capacity by 1
    public void signUp(){
        this.capacity--;
    }

    //Getter and setter methods for each attribute
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}