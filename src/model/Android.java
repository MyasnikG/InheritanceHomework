package model;

public class Android {

    private String version;
    private int storage;
    private boolean hasInternetAccess;
    private int batteryPower;
    private double price;
    private String brand;
    private String model;


    public Android(){

    }

    public Android(String version, int storage, boolean hasInternetAccess, int batteryPower, double price,String brand,
                   String model) {
        this.version = version;
        this.storage = storage;
        this.hasInternetAccess = hasInternetAccess;
        this.batteryPower = batteryPower;
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public void printInfo(){
        System.out.println("Android version is: " + version);
        System.out.println("Storage capacity is " + storage + " GB");
        System.out.println("Has internet access " + (hasInternetAccess ?"Yes":"No"));
        System.out.println("Battery power is: " + batteryPower);
        System.out.println("The price of this technology is: $" + price);
        System.out.println("This device brand is " + brand);
        System.out.println("This device model is " + model);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isHasInternetAccess() {
        return hasInternetAccess;
    }

    public void setHasInternetAccess(boolean hasInternetAccess) {
        this.hasInternetAccess = hasInternetAccess;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
