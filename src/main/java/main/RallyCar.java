package main;

/**
 * This class is the abstract parent class for the rally cars
 */

public abstract class RallyCar {
    //attributes
    private String make;
    private String model;
    private int horsepower;


    //constructor 
    public RallyCar(String make, String model, int horsepower) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }

    //Method for get the "make"
    public String getMake() {
        return make;
    }

    //method for get the model
    public String getModel() {
        return model;
    }

    // method for get the horsepower
    public int getHorsepower() {
        return horsepower;
    }

    //abstract method for calculate the performance, does not make any sence right now
    public abstract double calculatePerformance();
    
    
}
