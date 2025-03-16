package main;
/**
 * This class represnts a driver which includes the RallyCar class
 */

public class Driver {
    //Attributes
    private String name;
    private String country;
    private int points;
    private RallyCar car;
    private int Currentpoints; //I added this attribute to store the recived points from the recent race.

    //Constructor
    public Driver(String name, String country, RallyCar car) {
        this.name = name;
        this.country = country;
        this.car = car;
        this.points = 0;
        points = 0; 
    }

    //Method for get the name
    public String getName() {
        return name;
    }

    //Method for get the country
    public String getCountry() {
        return country;
    }

    //Method for get the points
    public int getPoints() {
        return points;
    }

    //Method for get the car
    public RallyCar getCar() {
        return car;
    }

    //Method for add points
    public void addPoints(int points) {
        this.points += points;
        Currentpoints = points; //Store the recived points from the recent race
    }

    //Method for get the recived points
    public int getCurrentPoints() {
        return Currentpoints;
    }
}
