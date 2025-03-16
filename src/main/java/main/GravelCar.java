package main;
/**
 * This class is represents a gravel car which is a subclass of RallyCar
 */

public class GravelCar extends RallyCar {
    //attributes
    private  double suspensionTravel;

    //constructor
    public GravelCar(String make, String model, int horsepower, double suspensionTravel) {
        super(make, model, horsepower);
        this.suspensionTravel = suspensionTravel;
        
    }

    //method for get the suspension travel
    public double getSuspensionTravel() {
        return suspensionTravel;
    }

    //method for calculate the performance
    @Override
    public double calculatePerformance() {
        return (getHorsepower() * 100) / suspensionTravel; // the calculation is added by copilot, I don't know how to calculate the performance of a rally car
    }
}
