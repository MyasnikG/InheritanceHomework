import model.*;

public class Main {
    public static void main(String[] args) {

        Android android = new Android();
        Smartphone smartphone = new Smartphone("Android 12",512,true,5000,929,
                "Samsung","Galaxy S22 Ultra", 50,"Google Chrome", new String[]{"Notes", "Gmail", "Translate"});

        smartphone.printInfo();
        System.out.println();
        System.out.println();

        SmartTV smartTV = new SmartTV("10",8,true,5000,1599.9,"Sony","Z95K",1000,189.7,"1500x837");
        smartTV.printInfo();
        System.out.println();

        SmartHome smarthome = new SmartHome("9",5,true,7000,2500,"Nest","Hub Max","Yale Lock","Nest Cam Outdoor","Google Assistant");
        smarthome.printInfo();
        System.out.println();

        Projector projector = new Projector("11",3,false,5000,499.9,"Google","Home Theater",2200,150);
        projector.printInfo();

    }
}