import java.util.Date;

public class TripRequest {
    private final Trip trip;
    private final Driver driver;
    private final Vehicle vehicle;
    private final Date startTime;
    private Date endTime;
    public TripRequest(Trip trip, Driver driver, Vehicle vehicle){
        this.trip = trip;
        this.driver = driver;
        this.vehicle = vehicle;
        startTime = new Date();
    }
    public Trip getTrip(){
        return trip;
    }
    public Driver getDriver() {
        return driver;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    public void completeTrip(int carDamageInPercent){
        endTime = new Date();
        vehicle.setCarCondition(vehicle.getCarCondition() - carDamageInPercent);
    }
}
