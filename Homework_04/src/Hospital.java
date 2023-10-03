public class Hospital extends Building{
    String hospitalName;
    int bedCount;
    int patientCount;

    public Hospital(String address){
        super(address);
    }
    public Hospital(String address, String hospitalName, int bedCount, int patientCount) {
        super(address);
        this.hospitalName = hospitalName;
        this.bedCount = bedCount;
        this.patientCount = patientCount;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }
    /**
     * @param description Format "Key: value; Key: value; ..."
     * */
    @Override
    public void setAttributesFromDescription(String description) {
        String[] parts = description.split(";");
        for (String part : parts) {
            String[] keyValue = part.trim().split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim().toLowerCase();
                String value = keyValue[1].trim();

                switch (key) {
                    case "address" -> address = value;
                    case "hospitalname" -> hospitalName = value;
                    case "bedcount" -> bedCount = Integer.parseInt(value);
                    case "patientcount" -> patientCount = Integer.parseInt(value);
                }
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Hospital Information:");
        System.out.println("\tAddress: " + getAddress());
        System.out.println("\tHospital Name: " + hospitalName);
        System.out.println("\tBed Count: " + bedCount);
        System.out.println("\tPatient Count: " + patientCount);
    }
}
