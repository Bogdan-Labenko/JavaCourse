public class Vehicle {
    private String number;
    private int liftingCapacity;
    private int carCondition;
    private boolean isCrashed;
    private DriverCategory driverCategory;
    private boolean isAvailable;
    public Vehicle(String number, int liftingCapacityKg, int carCondition, boolean isCrashed, DriverCategory driverCategory){
        this.number = number;
        this.liftingCapacity = liftingCapacityKg;
        this.carCondition = carCondition;
        this.isCrashed = isCrashed;
        this.driverCategory = driverCategory;
        isAvailable = false;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int getLiftingCapacity() {
        return liftingCapacity;
    }
    public void setLiftingCapacity(int liftingCapacityKg) {
        this.liftingCapacity = liftingCapacityKg;
    }
    public int getCarCondition() {
        return carCondition;
    }
    public void setCarCondition(int carCondition) {
        if (carCondition <= 0) setCrashed(true);
        else this.carCondition = carCondition;
    }
    public boolean isCrashed() {
        return isCrashed;
    }
    public void setCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }
    public DriverCategory getDriverCategory(){
        return driverCategory;
    }
    public void setDriverCategory(DriverCategory driverCategory){
        this.driverCategory = driverCategory;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
}
