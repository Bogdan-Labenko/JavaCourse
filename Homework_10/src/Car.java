public abstract class Car {
    protected final String name;
    protected final int maxSpeed;
    public Car(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public String getName(){
        return name;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

}
