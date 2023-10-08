import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TripLogger {
    private static final String LOG_FILE = "trip_log.txt";

    public static void logCompletedTrip(TripRequest tripRequest) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String start = dateFormat.format(tripRequest.getStartTime());
            String end = dateFormat.format(tripRequest.getEndTime());

            writer.println("Start: [" + start + "] End: [" +  end  + "]");
            writer.println("Driver: " + tripRequest.getDriver().getFullName());
            writer.println("Vehicle number: "  + tripRequest.getVehicle().getNumber() + " Car condition: " + tripRequest.getVehicle().getCarCondition() + " %");
            writer.println("Trip Details: " + tripRequest.getTrip().getTripNumber() + " to " + tripRequest.getTrip().getDestination());
            writer.println("----------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

