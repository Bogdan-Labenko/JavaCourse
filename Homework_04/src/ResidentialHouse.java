public class ResidentialHouse extends Building{
    int numberOfResidents;
    int numberOfApartments;
    public ResidentialHouse(String address) {
        super(address);
    }
    public ResidentialHouse(String address, int numberOfResidents, int numberOfApartments){
        super(address);
        this.numberOfResidents = numberOfResidents;
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
    /**
     * @param description Format "Key: value; Key: value; ..."
     * */
    @Override
    public void setAttributesFromDescription(String description) {
        String[] parts = description.split(";");
        for(String part : parts){
            String[] keyValue = part.trim().split(":");
            if(keyValue.length == 2){
                String key = keyValue[0].trim().toLowerCase();
                String value = keyValue[1].trim();

                switch (key) {
                    case "address" -> address = value;
                    case "numberofresidents" -> numberOfResidents = Integer.parseInt(value);
                    case "numberofapartments" -> numberOfApartments = Integer.parseInt(value);
                }
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Residential House Information:");
        System.out.println("\tAddress: " + getAddress());
        System.out.println("\tNumber of Residents: " + numberOfResidents);
        System.out.println("\tNumber of Apartments: " + numberOfApartments);
    }
}
