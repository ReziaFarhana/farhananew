package learnoop.abstraction;

public class GeneralMotors implements Car {
    //Variables:
    String brand="GM";
    String carModel="M 2023";
    static double carPrice= 90000;

    //We can declare Static Method:
    public static void carInfo(){
        System.out.println("This is General Motors");

    }

    //Through implementation we get Car interface properties:
    public void startCar() {
        System.out.println("This car has start feature.");

    }

    public void stopCar() {
        System.out.println("This car has stop feature.");

    }

    public void wheelCar() {
        System.out.println("This car has wheel feature.");

    }

    public void steerCar() {
        System.out.println("This car has steer feature.");

    }//we can now its a concrete class.

    public void carRoof() {

    }
    //Now we can create object. but earlier we can't.
    //GeneralMotors gm=new GeneralMotors();
    //String brand ="GM";

    //We can declare non-static method:
    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
}


    //we can call Car properties in GM by selecting implements.
}
