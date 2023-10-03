// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        School school = new School("12a", 2000, "Gymnasium");
        school.displayInfo();
        school.setAttributesFromDescription("Address: 122c; NumbErOfSTudents: 3141;  accredItationLevel: Hogwarts");
        school.displayInfo();

        ResidentialHouse residentialHouse = new ResidentialHouse("123b", 1233, 123);
        residentialHouse.displayInfo();
        residentialHouse.setAttributesFromDescription("Address: 313");
        residentialHouse.displayInfo();

        Hospital hospital = new Hospital("41.", "Hospital 12", 123, 94);
        hospital.displayInfo();
        hospital.setAttributesFromDescription("Address: 55a.; hospitalname: New name; bedcount: 140; patientCount: 60");
        hospital.displayInfo();

        Store store = new Store("5b", "MyStore", 75, StoreType.SUPERMARKET);
        store.displayInfo();

        Street street = new Street("Main St.");
        street.displayInfo();
        street.addBuilding(school);
        street.addBuildings(residentialHouse, hospital, store);
        street.displayInfo();
    }
}