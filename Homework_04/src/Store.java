public class Store extends Building{
    private String storeName;
    private int floorArea;
    private StoreType storeType;

    public Store(String address) {
        super(address);
    }

    public Store(String address, String storeName, int floorArea, StoreType storeType) {
        super(address);
        this.storeName = storeName;
        this.floorArea = floorArea;
        this.storeType = storeType;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(int floorArea) {
        this.floorArea = floorArea;
    }

    public StoreType getStoreType() {
        return storeType;
    }

    public void setStoreType(StoreType storeType) {
        this.storeType = storeType;
    }

    @Override
    public void setAttributesFromDescription(String description) {
        String[] parts = description.split(";");
        for (String part : parts) {
            String[] keyValue = part.trim().split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim().toLowerCase();
                String value = keyValue[1].trim();

                switch (key) {
                    case "address" -> setAddress(value);
                    case "storename" -> storeName = value;
                    case "floorarea" -> floorArea = Integer.parseInt(value);
                    case "storetype" -> storeType = StoreType.valueOf(value);
                }
            }
        }
    }

    @Override
    public void displayInfo() {

        System.out.println("Store Information:");
        System.out.println("\tAddress: " + getAddress());
        System.out.println("\tStore Name: " + storeName);
        System.out.println("\tFloor Area: " + floorArea + " sq. meters");
        System.out.println("\tStore Type: " + storeType);
    }
}
