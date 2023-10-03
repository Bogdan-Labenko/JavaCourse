
public class School extends Building{
    private int numberOfStudents;
    private String accreditationLevel;

    public School(String address){
        super(address);
    }
    public School(String address, int numberOfStudents, String accreditationLevel){
        super(address);
        this.numberOfStudents = numberOfStudents;
        this.accreditationLevel = accreditationLevel;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }
    public String getAccreditationLevel(){
        return accreditationLevel;
    }
    public void setAccreditationLevel(String accreditationLevel){
        this.accreditationLevel = accreditationLevel;
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
                    case "numberofstudents" -> numberOfStudents = Integer.parseInt(value);
                    case "accreditationlevel" -> accreditationLevel = value;
                }
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("School Information:");
        System.out.println("\tAddress: " + getAddress());
        System.out.println("\tNumber of Students: " + numberOfStudents);
        System.out.println("\tAccreditation Level: " + accreditationLevel);
    }
}
