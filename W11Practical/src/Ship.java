import java.util.ArrayList;

public class Ship { 

    //Declare attributes to store the ship's name, total capacity, current capacity, itinerary and passenger list
    private String shipName;
    private int totalCapacity;
    private int capacity;
    private ArrayList<Destination> itinerary = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();

    //Constructor that intitalises everything
    Ship(String shipName, int totalCapacity, int capacity, ArrayList<Destination> itinerary, ArrayList<Passenger> passengers){
        this.shipName = shipName;
        this.totalCapacity = totalCapacity;
        this.capacity = capacity;
        this.itinerary = itinerary;
        this.passengers = passengers;
    }

    // Public method that prints the details of all destinations and their respective activities
    public void printItinerary(){

        // Print the ships name and introduction to list 
        System.out.println("The ships name is " + this.shipName);
        System.out.println("Destinations:");
        
        // For loop to print every destination's details 
        for(int i = 0; i < this.itinerary.size(); i++){
            this.itinerary.get(i).printDetails();
        }
    }

    // Public method to print the passenger list
    public void printPassengers(){

        // Print the ships name and introduction to list 
        System.out.println("The ships name is " + this.shipName);
        System.out.println("Passengers:");
        
        // For loop to print each passenger's details 
        for(int i = 0; i < this.passengers.size(); i++){
            System.out.println("Passenger name: " + this.passengers.get(i).getPassengerName());
            System.out.println("Passenger number: " + this.passengers.get(i).getPassengerNo());
        }
    }

    // Public method to print out all activities with space left
    public void printAvailaibleItinerary(){

        // Print introduction to list 
        System.out.println("Activities with spaces still available:");
        
        // For loop that calls the method that will print available activities from the destination class for each destination
        for(int i = 0; i < this.itinerary.size(); i++){
            this.itinerary.get(i).printAvailaibleActivities();
        }
    }

    //Getter and setter methods for each attribute of this class
    public String getShipName() {
        return this.shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Destination> getItinerary() {
        return itinerary;
    }
    public void setItinerary(ArrayList<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }  
}
