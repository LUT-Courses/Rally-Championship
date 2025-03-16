package main;

import java.util.List;
/**
 * This class calculates the statistics of the championship
 */
public class ChampionshipStatistics {
    
    //Method for calculate the average points per driver
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        double totalPoints = 0;
        for (Driver driver : drivers) {
            totalPoints += driver.getPoints();
        }
        return totalPoints / ChampionshipManager.getTotalDrivers();
    }

    //Method for find the most successful country
    public static String findMostSuccesfulCountry(List<Driver> drivers) {
        int maxPoints = 0;
        String country = "";
        //Find the most successful country even if the list is not sorted by points
        for (Driver driver : drivers) {
            if (driver.getPoints() > maxPoints) {
                maxPoints = driver.getPoints();
                country = driver.getCountry();
            }
        }
        return country;
    }

    //Method for find the number of held races
    public static int findNumberOfHeldRaces() {
        return ChampionshipManager.getTotalRaces();
    }
}
