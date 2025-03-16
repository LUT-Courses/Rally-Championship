package main;

/**
 * Main class
 *
 */
public class RallyChampionship
{
    public static void main( String[] args )
    {
        //create the Championship manager
        ChampionshipManager manager = ChampionshipManager.getInstance();

        //Create the drivers and cars
        RallyCar gravel = new GravelCar("Toyota", "Yaris", 380, 250);
        RallyCar asphalt = new AsphaltCar("Hyundai", "i20", 400, 200);

        Driver driver1 = new Driver("Sébastien Ogier", "France", gravel);
        Driver driver2 = new Driver("Ott Tänak", "Estonia", asphalt);
        Driver driver3 = new Driver("Kalle Rovanperä", "Finland", gravel);
        Driver driver4 = new Driver("Thierry Neuville", "Belgium", asphalt);

        //Register the drivers
        manager.registerDriver(driver1);
        manager.registerDriver(driver2);
        manager.registerDriver(driver3);
        manager.registerDriver(driver4);

        //Simulate a race to initialize the driver standings
        RallyRaceResult race1 = new RallyRaceResult("", "");
        
        race1.recordResult(driver1, 1, 40);
        race1.recordResult(driver2, 3, 40);
        race1.recordResult(driver3, 2, 30);
        race1.recordResult(driver4, 4, 30);
        manager.addRaceResult(race1);

        //print the standings
        System.out.println("\n=====DRIVER STANDINGS=====");
        int n = 1;
        for (Driver driver : manager.getDriverStandings()) {
            System.out.println(" Position " + n + ": " + driver.getName()+ " (" + driver.getCountry() +") " + " : " + driver.getPoints() + " points");
            n++;
        }


        //Print the championship leader
        System.out.println("\n=====CHAMPIONSHIP LEADER=====");
        System.out.println(manager.getLeadingDriver().getName() + " (" + manager.getLeadingDriver().getCountry() + ") with " + manager.getLeadingDriver().getPoints() + " points");

        //Print the championship statistics
        System.out.println("\n=====CHAMPIONSHIP STATISTICS=====");
        System.out.println("Total drivers: " + ChampionshipManager.getTotalDrivers());
        System.out.println("Total Races: " + ChampionshipManager.getTotalRaces());
        System.out.println("Average points per driver: "  + ChampionshipStatistics.calculateAveragePointsPerDriver(manager.getDriverStandings())); //calculate the average points per driver from the list of driver standings
        System.out.println("Most successful country: " + ChampionshipStatistics.findMostSuccesfulCountry(manager.getDriverStandings())); //find the most successful country from the list of driver standings
        System.out.println("Total championship points: " + ChampionshipManager.getTotalCahmpionshipPoints()); //calculate the average points per driver from the list of driver standings
        
        //simulate the next 2 races
        RallyRaceResult race2 = new RallyRaceResult("Rally Finland", "Jyväskylä");
        race2.recordResult(driver1, 1, 20);
        race2.recordResult(driver2, 2, 15);
        race2.recordResult(driver3, 3, 12);
        race2.recordResult(driver4, 4, 9);
        manager.addRaceResult(race2);

        RallyRaceResult race3 = new RallyRaceResult("Monte Carlo Rally", "Monaco");
        race3.recordResult(driver1, 3, 15);
        race3.recordResult(driver2, 4, 10);
        race3.recordResult(driver3, 1, 25);
        race3.recordResult(driver4, 2, 18);
        manager.addRaceResult(race3);

        //print the results of the races
        n = 1;
        System.out.println("\n=====RACE RESULTS=====");
        System.out.println("Race: " + race2.getRaceName() + " ("+ race2.getLocation() + ")");
        for (Driver driver : race2.getResults()) {
            System.out.println("Position :" + n + ": " + driver.getName() + " (" + driver.getCountry() + ") " + " - " + driver.getCurrentPoints() + " points");
            n++;
        }

        n = 1;
        System.out.println("\n=====RACE RESULTS=====");
        System.out.println("Race: " + race3.getRaceName() + " ("+ race3.getLocation() + ")");
        for (Driver driver : race3.getResults()) {
            System.out.println("Position " + n + ": " + driver.getName() + " (" + driver.getCountry() + ") " + " - " + driver.getCurrentPoints() + " points");
            n++;
        }

        //display the car performances
        System.out.println("\n=====CAR PERFORMANCES RATINGS=====");
        System.out.println("Gravel car performance: " + gravel.calculatePerformance());
        System.out.println("Asphalt car performance: " + asphalt.calculatePerformance());

        //Print the championship statistics
        System.out.println("\n=====CHAMPIONSHIP STATISTICS=====");
        System.out.println("Total drivers: " + ChampionshipManager.getTotalDrivers());
        System.out.println("Total Races: " + ChampionshipManager.getTotalRaces());
        System.out.println("Average points per driver: "  + ChampionshipStatistics.calculateAveragePointsPerDriver(manager.getDriverStandings())); //calculate the average points per driver from the list of driver standings
        System.out.println("Most successful country: " + ChampionshipStatistics.findMostSuccesfulCountry(manager.getDriverStandings())); //find the most successful country from the list of driver standings
        System.out.println("Total championship points: " + ChampionshipManager.getTotalCahmpionshipPoints()); //calculate the average points per driver from the list of driver standings

         //print the standings
         System.out.println("\n=====DRIVER STANDINGS=====");
         n = 1;
         for (Driver driver : manager.getDriverStandings()) {
             System.out.println(" Position " + n + ": " + driver.getName()+ " (" + driver.getCountry() +") " + " : " + driver.getPoints() + " points");
             n++;
         }

        //Print the championship leader
        System.out.println("\n=====CHAMPIONSHIP LEADER=====");
        System.out.println(manager.getLeadingDriver().getName() + " (" + manager.getLeadingDriver().getCountry() + ") with " + manager.getLeadingDriver().getPoints() + " points");
    }
}
