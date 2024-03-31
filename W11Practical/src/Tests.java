import java.util.ArrayList;

public class Tests {

    // In this test a variety of ship, destination, passenger (using subclasses) and activity objects (using subclasses) will be instantiated in which they will be assigned several values and check if the print details methods work. specifcally print itinerary and print passengers. 
    public void scenario1() {

        //Create actor objects for theatre objects
        Actor romeo = new Actor("Jeremy Cooper", "Romeo");
        Actor juliet = new Actor("Alexandra Froll", "Juliet");

        Actor hamlet = new Actor("John Smithsonian", "Hamlet");
        Actor claudia = new Actor("Laura Ming", "Claudia");
        Actor ophelia = new Actor("Lauren Ping", "Ophelia");
        Actor gertrude = new Actor("Cameron Davis", "Gertrude");

        //Create array lists to store actors in for theatre objects
        ArrayList<Actor> romeoAndJuliet = new ArrayList<>();
        romeoAndJuliet.add(romeo);
        romeoAndJuliet.add(juliet);

        ArrayList<Actor> hamletActors = new ArrayList<>();
        hamletActors.add(hamlet);
        hamletActors.add(claudia);
        hamletActors.add(ophelia);
        hamletActors.add(gertrude);

        //Create actvivites to store in activities array list to store in destination
        Theatre romeoJuliet = new Theatre("Romeo and Juliet", "An amazing two person performance of Romeo and Juliet", 10.00, 50, 46, romeoAndJuliet);
        Attraction teaCups = new Attraction("Tea Cups", "A classic tea cup ride for kids", 2.00, 15, 4);
        WalkingTour barcelonaWalk = new WalkingTour("Barcelona Walking Tour", "A lovely walk around barcelona", 20.00, 20, 10, 20.00);

        Theatre hamletTheatre = new Theatre("Hamlet", "A classic production of Hamlet", 7.00, 20, 2, hamletActors);
        WalkingTour collaseumTour = new WalkingTour("Rome Collaseum Tour", "Walk around the historic collaseum", 50.00, 25, 24, 10.0);

        //Create a few array lists of activities
        ArrayList<Activity> barcelonaActivities = new ArrayList<>();
        barcelonaActivities.add(romeoJuliet);
        barcelonaActivities.add(teaCups);
        barcelonaActivities.add(barcelonaWalk);

        ArrayList<Activity> romeActivities = new ArrayList<>();
        romeActivities.add(hamletTheatre);
        romeActivities.add(collaseumTour);

        //Create destinations to store in the itinerary
        Destination barcelona = new Destination("barcelona", barcelonaActivities);
        Destination rome = new Destination("Rome", romeActivities);

        //Create array list for the itinerary
        ArrayList<Destination> titanicItinerary = new ArrayList<>();
        titanicItinerary.add(barcelona);
        titanicItinerary.add(rome);

        //Create empty array list as the passengers havent signed up for any activities yet
        ArrayList<Activity> emptyActivities = new ArrayList<>();
        
        //Create passenger objects for the titanic
        Standard john = new Standard("John Johnson", 1, 100.00, emptyActivities);
        Senior alex = new Senior("Alexa Amazon", 2, 50.00, emptyActivities);
        Premium carl = new Premium("Carl Carlson", 3, emptyActivities);

        //Create array list of passengers
        ArrayList<Passenger> titanicPassengers = new ArrayList<>(); 
        titanicPassengers.add(john);
        titanicPassengers.add(alex);
        titanicPassengers.add(carl);

        //Create ship object
        Ship titanic = new Ship("Titanic", 100, 3, titanicItinerary, titanicPassengers);
    
        titanic.printItinerary();
        System.out.println();
        titanic.printPassengers();
    
    }

    // In this test a variety of ship, destination, passenger (using subclasses) and activity objects (using subclasses) will be instantiated in which they will be assigned values and then passengers will sign up for certain activities then print the details of the individual passengers.
    public void scenario2() {

        //Create actor objects for theatre objects
        Actor romeo = new Actor("Jeremy Cooper", "Romeo");
        Actor juliet = new Actor("Alexandra Froll", "Juliet");

        Actor hamlet = new Actor("John Smithsonian", "Hamlet");
        Actor claudia = new Actor("Laura Ming", "Claudia");
        Actor ophelia = new Actor("Lauren Ping", "Ophelia");
        Actor gertrude = new Actor("Cameron Davis", "Gertrude");

        //Create array lists to store actors in for theatre objects
        ArrayList<Actor> romeoAndJuliet = new ArrayList<>();
        romeoAndJuliet.add(romeo);
        romeoAndJuliet.add(juliet);

        ArrayList<Actor> hamletActors = new ArrayList<>();
        hamletActors.add(hamlet);
        hamletActors.add(claudia);
        hamletActors.add(ophelia);
        hamletActors.add(gertrude);

        //Create actvivites to store in activities array list to store in destination
        Theatre romeoJuliet = new Theatre("Romeo and Juliet", "An amazing two person performance of Romeo and Juliet", 10.00, 50, 46, romeoAndJuliet);
        Attraction teaCups = new Attraction("Tea Cups", "A classic tea cup ride for kids", 2.00, 15, 4);
        WalkingTour barcelonaWalk = new WalkingTour("Barcelona Walking Tour", "A lovely walk around barcelona", 20.00, 20, 10, 20.00);

        Theatre hamletTheatre = new Theatre("Hamlet", "A classic production of Hamlet", 7.00, 20, 2, hamletActors);
        WalkingTour collaseumTour = new WalkingTour("Rome Collaseum Tour", "Walk around the historic collaseum", 50.00, 25, 24, 10.0);

        //Create a few array lists of activities
        ArrayList<Activity> barcelonaActivities = new ArrayList<>();
        barcelonaActivities.add(romeoJuliet);
        barcelonaActivities.add(teaCups);
        barcelonaActivities.add(barcelonaWalk);

        ArrayList<Activity> romeActivities = new ArrayList<>();
        romeActivities.add(hamletTheatre);
        romeActivities.add(collaseumTour);

        //Create destinations to store in the itinerary
        Destination barcelona = new Destination("barcelona", barcelonaActivities);
        Destination rome = new Destination("Rome", romeActivities);

        //Create array list for the itinerary
        ArrayList<Destination> titanicItinerary = new ArrayList<>();
        titanicItinerary.add(barcelona);
        titanicItinerary.add(rome);

        //Create empty array list as the passengers havent signed up for any activities yet
        ArrayList<Activity> emptyActivities = new ArrayList<>();
        
        //Create passenger objects for the titanic
        Standard john = new Standard("John Johnson", 1, 100.00, emptyActivities);
        Senior alex = new Senior("Alexa Amazon", 2, 50.00, emptyActivities);
        Premium carl = new Premium("Carl Carlson", 3, emptyActivities);
        
        //Have several passengers sign up for several activities
        john.signUp(romeoJuliet);
        john.signUp(barcelonaWalk);
        john.signUp(hamletTheatre);

        alex.signUp(romeoJuliet);
        alex.signUp(teaCups);

        carl.signUp(collaseumTour);

        //Print these passengers details
        john.printDetails();
        alex.printDetails();
        carl.printDetails();
    }


    // In this test a variety of ship, destination, passenger (using subclasses) and activity objects (using subclasses) will be instantiated in which they will be assigned several values and then they will print activities with space available after a few passengers make certain activities full.
    public void scenario3() {

        //Create actor objects for theatre objects
        Actor romeo = new Actor("Jeremy Cooper", "Romeo");
        Actor juliet = new Actor("Alexandra Froll", "Juliet");
        
        Actor hamlet = new Actor("John Smithsonian", "Hamlet");
        Actor claudia = new Actor("Laura Ming", "Claudia");
        Actor ophelia = new Actor("Lauren Ping", "Ophelia");
        Actor gertrude = new Actor("Cameron Davis", "Gertrude");
    
        //Create array lists to store actors in for theatre objects
        ArrayList<Actor> romeoAndJuliet = new ArrayList<>();
        romeoAndJuliet.add(romeo);
        romeoAndJuliet.add(juliet);
    
        ArrayList<Actor> hamletActors = new ArrayList<>();
        hamletActors.add(hamlet);
        hamletActors.add(claudia);
        hamletActors.add(ophelia);
        hamletActors.add(gertrude);

        //Create actvivites to store in activities array list to store in destination
        Theatre romeoJuliet = new Theatre("Romeo and Juliet", "An amazing two person performance of Romeo and Juliet", 10.00, 50, 46, romeoAndJuliet);
        Attraction teaCups = new Attraction("Tea Cups", "A classic tea cup ride for kids", 2.00, 15, 1);
        WalkingTour barcelonaWalk = new WalkingTour("Barcelona Walking Tour", "A lovely walk around barcelona", 20.00, 20, 10, 20.00);

        Theatre hamletTheatre = new Theatre("Hamlet", "A classic production of Hamlet", 7.00, 20, 2, hamletActors);
        WalkingTour collaseumTour = new WalkingTour("Rome Collaseum Tour", "Walk around the historic collaseum", 50.00, 25, 0, 10.0);

        //Create a few array lists of activities
        ArrayList<Activity> barcelonaActivities = new ArrayList<>();
        barcelonaActivities.add(romeoJuliet);
        barcelonaActivities.add(teaCups);
        barcelonaActivities.add(barcelonaWalk);

        ArrayList<Activity> romeActivities = new ArrayList<>();
        romeActivities.add(hamletTheatre);
        romeActivities.add(collaseumTour);

        //Create destinations to store in the itinerary
        Destination barcelona = new Destination("barcelona", barcelonaActivities);
        Destination rome = new Destination("Rome", romeActivities);

        //Create array list for the itinerary
        ArrayList<Destination> titanicItinerary = new ArrayList<>();
        titanicItinerary.add(barcelona);
        titanicItinerary.add(rome);
        
        //Create empty array list as the passengers havent signed up for any activities yet
        ArrayList<Activity> emptyActivities = new ArrayList<>();

        //Create passenger objects for the titanic
        Standard john = new Standard("John Johnson", 1, 100.00, emptyActivities);
        Senior alex = new Senior("Alexa Amazon", 2, 50.00, emptyActivities);
        Premium carl = new Premium("Carl Carlson", 3, emptyActivities);
        
        //Create array list of passengers
        ArrayList<Passenger> titanicPassengers = new ArrayList<>(); 
        titanicPassengers.add(john);
        titanicPassengers.add(alex);
        titanicPassengers.add(carl);
    
        //Create ship object
        Ship titanic = new Ship("Titanic", 100, 3, titanicItinerary, titanicPassengers);

        //Signup to activity to make it so there are no more spaces
        john.signUp(teaCups);

        //Have another passenger try to signup to an actitvity with no space left
        alex.signUp(teaCups);

        //Print available activities
        titanic.printAvailaibleItinerary();
    }
}
