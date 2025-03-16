package main;

import java.util.List;
/**
 * This is an interface with the methods for record the results
 */

public interface RaceResult {

    //Method for record the result
    public void recordResult(Driver driver, int position, int points);

    //Method for get the driver's points
    public int getDriverPoints(Driver driver);

    //Method for get the results
    public List<Driver> getResults();


}
