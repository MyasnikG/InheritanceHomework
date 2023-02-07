package model;

public class SmartTV extends Android{

    private int channels;

    private double screenSize;
    private String resolution;


    public SmartTV(String version, int storage, boolean hasInternetAccess, int batteryPower, double price,String brand, String model,
                   int channels, double screenSize, String resolution){

        super(version,storage,hasInternetAccess,batteryPower,price,brand,model);
        this.channels = channels;
        this.screenSize = screenSize;
        this.resolution=resolution;
    }
    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This smartTV has " + channels + " channels");
        System.out.println("This smartTV screen size is: " + screenSize);
        System.out.println("This smartTV screen resolution is: " + resolution);
    }
}
