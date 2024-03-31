public class PremiumCabin extends StandardCabin {

    //Constructor that instantiates all attributes
    PremiumCabin(String cabinName, Premium occupant){
        super(cabinName);
        this.occupant = occupant;
    }

    //Public method to print the details of a cabin
    public void printDetails(){

        //Print out a message saying this cabin is premium then use the superclasses details
        System.out.println("This cabin is premium.");
        super.printDetails();

    }
}
