public class Trip {
    private String tripNumber;
    private TripCategory tripCategory;
    private int tripWeight;
    private String destination;
    public Trip(String tripNumber, TripCategory tripCategory, int tripWeight, String destination) {
        this.tripNumber = tripNumber;
        this.tripCategory = tripCategory;
        this.tripWeight = tripWeight;
        this.destination = destination;
    }

    public String getTripNumber() {
        return tripNumber;
    }
    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }
    public TripCategory getTripCategory() {
        return tripCategory;
    }
    public void setTripCategory(TripCategory tripCategory) {
        this.tripCategory = tripCategory;
    }
    public int getTripWeight() {
        return tripWeight;
    }
    public void setTripWeight(int tripWeight) {
        this.tripWeight = tripWeight;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

}
