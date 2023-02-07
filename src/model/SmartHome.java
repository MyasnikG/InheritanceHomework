package model;

public class SmartHome extends Android {

    private String smartLock;
    private String securityCamera;
    private String voiceAssistant;

    public SmartHome(String version, int storage, boolean hasInternetAccess, int batteryPower, double price,String brand,String model,
                     String smartLock, String securityCamera, String voiceAssistant){

        super(version,storage,hasInternetAccess,batteryPower,price,brand,model);
        this.smartLock = smartLock;
        this.securityCamera=securityCamera;
        this.voiceAssistant=voiceAssistant;
    }


    public String getSmartLock() {
        return smartLock;
    }

    public void setSmartLock(String smartLock) {
        this.smartLock = smartLock;
    }

    public String getSecurityCamera() {
        return securityCamera;
    }

    public void setSecurityCamera(String securityCamera) {
        this.securityCamera = securityCamera;
    }

    public String getVoiceAssistant() {
        return voiceAssistant;
    }

    public void setVoiceAssistant(String voiceAssistant) {
        this.voiceAssistant = voiceAssistant;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Smart Lock type is: " + smartLock);
        System.out.println("Security camera is: " + securityCamera);
        System.out.println("Voice Assistant is " + voiceAssistant);
    }
}
