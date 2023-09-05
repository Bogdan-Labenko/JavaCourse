import java.util.ArrayList;

public class Country {
    private String countryName;
    private String continentName;
    private int population;
    private String phoneCode;
    private String capitalName;
    private ArrayList<City> cities;

    public Country(String countryName, String continentName, int population, String phoneCode, String capitalName, ArrayList<City> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capitalName = capitalName;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public int getPopulation() {
        return population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void displayInfo() {
        System.out.println("Название страны: " + countryName);
        System.out.println("Название континента: " + continentName);
        System.out.println("Количество жителей: " + population);
        System.out.println("Телефонный код: " + phoneCode);
        System.out.println("Столица: " + capitalName);
        System.out.println("Города страны: " + cities);
    }
}
