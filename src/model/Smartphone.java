package model;

public class Smartphone extends Android{

private int camera;
private String webBrowser;
private String [] apps;

    public Smartphone(String version, int storage, boolean hasInternetAccess, int batteryPower, double price,
                      String brand, String model, int camera, String webBrowser, String[] apps) {
        super(version,storage,hasInternetAccess,batteryPower,price,brand,model);
        this.camera = camera;
        this.webBrowser = webBrowser;
        this.apps = apps;
    }


    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getWebBrowser() {
        return webBrowser;
    }

    public void setWebBrowser(String webBrowser) {
        this.webBrowser = webBrowser;
    }

    public String[] getApps() {
        return apps;
    }

    public void setApps(String[] apps) {
        this.apps = apps;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("The camera of the smartphone is " + camera + " megapixels");
        System.out.println("The smartphone has " + webBrowser + " as default web browser");
        System.out.print("The smartphone has the following apps: ");
        for (String a: apps) {
            System.out.print(a + " ");
        }
    }
}
