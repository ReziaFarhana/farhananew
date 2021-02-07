package learnoop.abstraction;

public class Tesla implements Car, BoostEngine {

   static String modelRating="5.4";
   boolean selfAutoDriving=true;


    public void startCar() {
        System.out.println("Tesla has start feature");
    }

    public void stopCar() {
        System.out.println("Tesla has start feature");
    }

    public void wheelCar() {
        System.out.println("Tesla has start feature");
    }

    public void steerCar() {
        System.out.println("Tesla has start feature");
    }

    public void carRoof() {
        System.out.println("Tesla has start feature");

    }
    public static void teslaSpecialFeature(){
        System.out.println("No need for child lock.");
    }

    public void boostEngine() {
        System.out.println("Tesla has boost Engine Features.");
    }
}
