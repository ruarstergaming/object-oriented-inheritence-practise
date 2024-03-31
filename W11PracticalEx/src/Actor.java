public class Actor { 

    //Declare the attributes of the class
    private String actorName; 
    private String characterPlayed;

    //Constructor to instantiate all variables
    Actor(String actorName, String characterPlayed){
        this.actorName = actorName;
        this.characterPlayed = characterPlayed;
    }

    //Public method to print the details of the actor
    public void printDetails(){
        System.out.println(this.actorName + " plays " + this.characterPlayed);
    }

    //Getter and setter methods for each attribute
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getCharacterPlayed() {
        return characterPlayed;
    }

    public void setCharacterPlayed(String characterPlayed) {
        this.characterPlayed = characterPlayed;
    }

}
