import java.util.Objects;

public class StandardCabin {

    //Declare variables to store the name of the cabin and the passenger occupying it 
    protected String cabinName;
    protected Passenger occupant;
    
    //Constructor for an unoccupied room
    StandardCabin(String cabinName){
        this.cabinName = cabinName;
    }

    //Constructor that instantiates all attributes
    StandardCabin(String cabinName, Passenger occupant){
        this.cabinName = cabinName;
        this.occupant = occupant;
    }

    //Public method to print the details of a cabin
    public void printDetails(){

        //Print cabin name
        System.out.println("Cabin name: " + this.cabinName);

        //If the cabin has a passenger attribute i.e. oassenger is not null then display the occupants name and passenger number
        if(Objects.nonNull(occupant)){
            System.out.println("Occupant's name: " + occupant.getPassengerName());
            System.out.println("Occupant's number: " + occupant.getPassengerNo());
        }

        //Otherwise print "the room is unoccupied"
        else{
            System.out.println("Room is unnoccupied");
        }
    
    }

    public String getCabinName() {
        return cabinName;
    }

    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    public Passenger getOccupant() {
        return occupant;
    }

    public void setOccupant(Passenger occupant) {
        this.occupant = occupant;
    }
}
