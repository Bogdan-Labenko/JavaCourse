import java.util.List;

public class Dispatcher {
    List<TripRequest> activeTrips;
    public void assignTrips(List<Trip> trips, List<Driver> drivers, List<Vehicle> vehicles) {
        for (Trip trip : trips) {
            Driver assignedDriver = null;
            Vehicle assignedVehicle = null;

            //Finding driver
            TripCategory category =  trip.getTripCategory();
            for (Driver driver : drivers) {
                if (!driver.isAvailable()) continue;
                if (category == TripCategory.LOW && driver.getYearsOfExperience() >= 1) {
                    assignedDriver = driver;
                } else if (category == TripCategory.MEDIUM && driver.getYearsOfExperience() >= 3) {
                    assignedDriver = driver;
                } else if (category == TripCategory.HIGH && driver.getYearsOfExperience() >= 5) {
                    assignedDriver = driver;
                }
            }

            //if not found driver, skip
            if (assignedDriver == null) {
                System.out.println("Could not find a suitable driver for the transportation request " + trip.getTripNumber() + " in " + trip.getDestination());
                continue;
            }

            // Finding car
            for (Vehicle vehicle : vehicles) {
                if (!vehicle.isAvailable()) continue;
                if (vehicle.getLiftingCapacity() >= trip.getTripWeight()) {
                    assignedVehicle = vehicle;
                    break;
                }
            }

            //if not found vehicle, skip
            if (assignedVehicle == null) {
                System.out.println("Could not find a suitable vehicle for the transportation request " + trip.getTripNumber() + " in " + trip.getDestination());
                continue;
            }
            var request = new TripRequest(trip, assignedDriver, assignedVehicle);

            assignedDriver.setAvailable(false);
            assignedVehicle.setAvailable(false);

            activeTrips.add(request);
        }
    }
}
