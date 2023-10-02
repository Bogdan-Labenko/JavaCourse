import java.util.Scanner;

public class Car {
    private String name;
    private String manufacturer;
    private int year;
    private double engineCapacity;

    public Car() {}

    public Car(String name, String manufacturer, int year, double engineCapacity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car name: ");
        name = scanner.nextLine();
        System.out.print("Enter the manufacturer's name: ");
        manufacturer = scanner.nextLine();
        System.out.print("Enter the production year: ");
        year = scanner.nextInt();
        System.out.print("Enter the engine capacity: ");
        engineCapacity = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Production Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setCarManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
