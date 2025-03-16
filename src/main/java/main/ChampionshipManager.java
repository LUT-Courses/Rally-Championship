package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class manages the championship
 */

public class ChampionshipManager {
    
    //Attributes
    private static ChampionshipManager instance;
    private List<Driver> drivers;
    private List<RallyRaceResult>  races;
    private static int totalDrivers = 0;
    private static int totalRaces = 0;

    //Constructor
    private ChampionshipManager() {
        this.drivers = new ArrayList<>();
        this.races = new ArrayList<>();

        //static attributes
        totalDrivers = 0;
        totalRaces = 0;
    }

    //Method for get the instance of ChampionshipManager
    public static ChampionshipManager getInstance() {
        //Create a new instance if it is null
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    //Method for add a new driver
    public void registerDriver(Driver driver) {
        this.drivers.add(driver);
        totalDrivers++;
    }

    //Method for add a race result
    public void addRaceResult(RallyRaceResult result) {
        races.add(result);
        totalRaces++;
    }

    //Method for get the drivres standings
    public List<Driver> getDriverStandings() {
        Collections.sort(drivers, new Comparator<Driver>() { //the sorting by points is made with copilot
            @Override
            public int compare(Driver d1, Driver d2) {
                return Integer.compare(d2.getPoints(), d1.getPoints());
            }
        });
        return drivers;
    }

    //Method for get the leading driver
    public Driver getLeadingDriver() {
        Driver leadingDriver = drivers.get(0);
        //The method works even when the list is not sorted by points
        for (Driver driver : drivers) {
            if (driver.getPoints() > leadingDriver.getPoints()) {
                leadingDriver = driver;
            }
        }
        return leadingDriver;
    }

    //Method for get the total points
    public static int getTotalCahmpionshipPoints(){
        int totalPoints = 0;
        for (Driver driver : instance.drivers) { //Acces drivers through the instance beacuse it is a static method
            totalPoints += driver.getPoints();
        }
        return totalPoints;
    }

    //Method for get teh total races (this is not part of the UML diagram)
    public static int getTotalRaces() {
        return totalRaces;
    }

    //Method for get the total drivers (this is not part of the UML diagram)
    public static int getTotalDrivers() {
        return totalDrivers;
    }
}
