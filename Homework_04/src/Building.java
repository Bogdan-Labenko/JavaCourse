public abstract class Building {
    protected String address;

    public Building(String address){
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public abstract void setAttributesFromDescription(String description);
    public abstract void displayInfo();
}
