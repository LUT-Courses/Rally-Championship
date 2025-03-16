package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * This class is the implementation of the RaceResult interface and manages the results of a single race
 */

public class RallyRaceResult implements RaceResult{
    
    //Attributes
    private String raceName;
    private String location;
    private Map<Driver, Integer> results; 

    //Constructor
    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
        this.results = new HashMap<>();
    }

    //Method for get the name
    public String getRaceName() {
        return raceName;
    }

    //Method for get the location
    public String getLocation() {
        return location;
    }

    //method for record the of a driver
    @Override
    public void recordResult(Driver driver, int position, int points) {
        driver.addPoints(points); //add the points to the driver
        results.put(driver, position); //record the driver's position
    }

    //Method for get the driver's points
    @Override
    public int getDriverPoints(Driver driver) {
        return driver.getPoints(); 
    }

    //Method for get the results
    //I used copilot to implement this method
    @Override
    public List<Driver> getResults() {
        return results.entrySet().stream() //converts the map's entry set into a stream
            .sorted(Map.Entry.comparingByValue()) //sorts the entries by position (value)
            .map(Map.Entry::getKey) //Transforms the sorted stream of entries into a stream of keys (drivers) -> (extarcts them from the entries)
            .collect(Collectors.toList()); //Collects the stream of drivers into a list because a streams doesn't store elements
        
    }

}
