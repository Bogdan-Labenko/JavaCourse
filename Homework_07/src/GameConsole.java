public class GameConsole {
    public enum Brand{
        SONY,
        MICROSOFT,
        OTHER
    }
    Brand brand;
    String model;
    String serial;
    Gamepad firstGamepad;
    Gamepad secondGamepad;
    boolean isOn;
    public GameConsole(Brand brand, String serial){
        this.brand = brand;
        this.serial = serial;
        this.model = "Unknown";
        this.firstGamepad = new Gamepad(this.brand.toString(),  1);
        this.secondGamepad = new Gamepad(this.brand.toString(),  2);
        this.isOn = false;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public void setFirstGamepad(Gamepad firstGamepad) {
        this.firstGamepad = firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public void setSecondGamepad(Gamepad secondGamepad) {
        this.secondGamepad = secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    class Gamepad{
        String brand;
        String consoleSerial;
        int connectedNumber;
        String color;
        int chargeLevel;
        boolean isOn;

        public Gamepad(String brand, int connectedNumber){
            this.brand = brand;
            consoleSerial = serial;
            this.connectedNumber = connectedNumber;
            this.color = "UNKNOWN";
            chargeLevel = 100;
            this.isOn = false;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getSerial() {
            return consoleSerial;
        }

        public void setSerial(String serial) {
            this.consoleSerial = serial;
        }
        public int getConnectedNumber(){
            return connectedNumber;
        }
        public void setConnectedNumber(int connectedNumber){
            this.connectedNumber = connectedNumber;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public int getChargeLevel(){
            return chargeLevel;
        }
        public void setChargeLevel(int chargeLevel){
            this.chargeLevel = chargeLevel;
        }
        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean isOn) {
            this.isOn = isOn;
        }
    }
}
