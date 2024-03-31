import java.util.ArrayList;

public class Tests {

    // In this test a variety of ship, passenger (using subclasses), activity (using subclasses) and cabins objects will be instantiated in which they will be assigned several values and check if the print details methods work. specifcally print the cabins. 
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

        //Create empty array list as the passengers havent signed up for any activities yet or booked any cruises yet
        ArrayList<Ship> emptyShip = new ArrayList<>();
        ArrayList<Activity> emptyActivities = new ArrayList<>();
        
        //Create passenger objects for the titanic
        Standard john = new Standard("John Johnson", 1, 100.00, emptyActivities, emptyShip, emptyActivities);
        Senior alex = new Senior("Alexa Amazon", 2, 50.00, emptyActivities, emptyShip, emptyActivities);
        Premium carl = new Premium("Carl Carlson", 3, emptyActivities, emptyShip, emptyActivities);

        //Create cabin objects for the cruise
        StandardCabin TitanicA1 = new StandardCabin("A1");
        StandardCabin TitanicB2 = new StandardCabin("A1");
        StandardCabin TitanicC3= new StandardCabin("A1");

        //Create ArrayList of cruises cabins
        ArrayList<StandardCabin> titanicCabins = new ArrayList<>();
        titanicCabins.add(TitanicA1);
        titanicCabins.add(TitanicB2);
        titanicCabins.add(TitanicC3);

        //Create array list of passengers
        ArrayList<Passenger> titanicPassengers = new ArrayList<>(); 
        titanicPassengers.add(john);
        titanicPassengers.add(alex);
        titanicPassengers.add(carl);

        //Create ship object
        Ship titanic = new Ship("Titanic", 100, 3, titanicItinerary, titanicPassengers, titanicCabins);
    
        titanic.printCabins();
    
    }

    // In this test a variety of ship, destination, passenger (using subclasses), activity (using subclasses) and cabin objects will be instantiated in which they will be assigned values and then passengers will sign up for certain activities and multiple cruises then print the details of the individual passengers cruise and activity history.
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

        //Create array list for the itinerarys of both ships
        ArrayList<Destination> titanicItinerary = new ArrayList<>();
        titanicItinerary.add(barcelona);
        
        ArrayList<Destination> deLaCruiseItinerary = new ArrayList<>();
        deLaCruiseItinerary.add(rome);

        //Create empty array list as the passengers havent signed up for any activities yet or booked any cruises yet
        ArrayList<Ship> emptyShip = new ArrayList<>();
        ArrayList<Activity> emptyActivities = new ArrayList<>();
        
        //Create passenger objects for the titanic
        Standard john = new Standard("John Johnson", 1, 100.00, emptyActivities, emptyShip, emptyActivities);
        Senior alex = new Senior("Alexa Amazon", 2, 50.00, emptyActivities, emptyShip, emptyActivities);
        Premium carl = new Premium("Carl Carlson", 3, emptyActivities, emptyShip, emptyActivities);
        
        //Create cabin objects for each cruise
        StandardCabin titanicA1 = new StandardCabin("A1");
        StandardCabin titanicB2 = new StandardCabin("B2");
        StandardCabin titanicC3= new StandardCabin("C3");
        StandardCabin deLaCruiseA1 = new StandardCabin("A1");
        StandardCabin deLaCruiseB2 = new StandardCabin("B2");
        StandardCabin deLaCruiseC3 = new StandardCabin("C3");

        //Create ArrayList of each cruises cabins
        ArrayList<StandardCabin> titanicCabins = new ArrayList<>();
        titanicCabins.add(titanicA1);
        titanicCabins.add(titanicB2);
        titanicCabins.add(titanicC3);

        ArrayList<StandardCabin> deLaCruiseCabins = new ArrayList<>();
        deLaCruiseCabins.add(deLaCruiseA1);
        deLaCruiseCabins.add(deLaCruiseB2);
        deLaCruiseCabins.add(deLaCruiseC3);

        //Create array list of passengers for both cruises
        ArrayList<Passenger> titanicPassengers = new ArrayList<>(); 
        titanicPassengers.add(john);
        titanicPassengers.add(alex);
        titanicPassengers.add(carl);

        //Create the 2 ship objects
        Ship titanic = new Ship("Titanic", 100, 3, titanicItinerary, titanicPassengers, titanicCabins);
        Ship deLaCruise = new Ship("The De La Cruise", 100, 3, deLaCruiseItinerary, titanicPassengers, deLaCruiseCabins);

        //Have several passengers sign up for several activities and book cruises
        john.bookCruise(titanic, titanicA1);
        john.bookCruise(deLaCruise, deLaCruiseA1);
        john.signUp(romeoJuliet);
        john.signUp(barcelonaWalk);
        john.signUp(hamletTheatre);

        alex.bookCruise(titanic, titanicB2);
        alex.bookCruise(deLaCruise, deLaCruiseB2);
        alex.signUp(romeoJuliet);
        alex.signUp(teaCups);

        john.bookCruise(titanic, titanicC3);
        john.bookCruise(deLaCruise, deLaCruiseC3);
        carl.signUp(collaseumTour);



        //Print these passengers details
        john.printCruiseHistory();
        alex.printCruiseHistory();
        carl.printCruiseHistory();
    }

}
