import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<DriverCategory> categories = new ArrayList<DriverCategory>();
        categories.add(DriverCategory.B);
        Driver driver = new Driver("John", 5, 30, categories);
        Vehicle vehicle = new Vehicle("AB1234AB", 1000, 100, false, DriverCategory.B);
        Trip trip = new Trip("3155151", TripCategory.HIGH, 500, "Destination");

        TripRequest tripRequest = new TripRequest(trip, driver, vehicle);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tripRequest.completeTrip(10);

        TripLogger.logCompletedTrip(tripRequest);
    }
}