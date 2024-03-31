import java.util.ArrayList;
 
public class Theatre extends Activity{
    
    //Declare extra variable unique to the subclass
    private ArrayList<Actor> actors = new ArrayList<>(); 

    //Constructor to instantiate everything
    public Theatre(String activityName, String description, double cost, int totalCapacity, int capacity, ArrayList<Actor> actors){

        //Use the superclass's constructor to instantiated inherited attributes
        super(activityName, description, cost, totalCapacity, capacity);
        
        //Instantiate the attribute unique to this class
        this.actors = actors;
    } 

    //Public overridden method that prints the details of the object
    public void printDetails(){

        //Use the superclasses printDetails method to print other attributes
        super.printDetails();

        System.out.println("Cast List:");

        //For loop to print the other attributes        
        for(int i = 0; i < this.actors.size(); i++){
            this.actors.get(i).printDetails();
        }
    }

    //Getter and setter methods for the unique variables of this subclass
    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

}
