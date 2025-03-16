package main;
/**
 * This class is represents an asphalt xar which is a subclass of RallyCar
 */

public class AsphaltCar extends RallyCar {
    //Attributes
    private double downforce;

    //Constructor
    public AsphaltCar(String make, String model, int horsepower, double downforce) {
        super(make, model, horsepower);
        this.downforce = downforce;
    }

    //Method for get the downforce
    public double getDownforce() {
        return downforce;
    }

    //method for calculate the performance
    @Override
    public double calculatePerformance() {
        return (getHorsepower() * 100) / downforce; // the calculation is added by copilot, I don't know how to calculate the performance of a rally car
    }
    
}
