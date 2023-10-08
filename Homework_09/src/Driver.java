import java.util.List;

public class Driver {
    private String fullName;
    private int yearsOfExperience;
    private int age;
    private List<DriverCategory> driverCategory;
    private boolean isAvailable;
    public Driver(String fullName, int yearsOfExperience, int age, List<DriverCategory> driverCategory) {
        this.fullName = fullName;
        this.yearsOfExperience = yearsOfExperience;
        this.age = age;
        this.driverCategory = driverCategory;
        isAvailable = false;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<DriverCategory> getDriverCategory() {
        return driverCategory;
    }
    public void setDriverCategory(List<DriverCategory> driverCategory) {
        this.driverCategory = driverCategory;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
}
