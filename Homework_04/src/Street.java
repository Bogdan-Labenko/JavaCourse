import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Street {
    String streetName;
    List<Building> buildings;

    public Street(String streetName){
        this.streetName = streetName;
        buildings = new ArrayList<>();
    }
    public void addBuilding(Building building) {
        buildings.add(building);
    }
    public void addBuildings(Building... buildings) {
        Collections.addAll(this.buildings, buildings);
    }
    public void displayInfo() {
        System.out.println("Street: " + streetName);
        for (Building building : buildings) {
            building.displayInfo();
        }
    }
}
