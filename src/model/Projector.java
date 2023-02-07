package model;

public class Projector extends Android{

    private int brightness;
    private double projectionDistance;

    public Projector(String version, int storage, boolean hasInternetAccess, int batteryPower, double price,
                     String brand,String model,int brightness, double projectionDistance){

        super(version,storage,hasInternetAccess,batteryPower,price,brand,model);
        this.brightness=brightness;
        this.projectionDistance=projectionDistance;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public double getProjectionDistance() {
        return projectionDistance;
    }

    public void setProjectionDistance(double projectionDistance) {
        this.projectionDistance = projectionDistance;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mini projector has " + brightness + " Lumens brightness");
        System.out.println("Mini projector has " + projectionDistance + " meters projection distance");
    }
}
