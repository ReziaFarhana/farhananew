package learnoop.abstraction;

import java.sql.SQLOutput;

import static learnoop.abstraction.Car.carDoor;

public class TestCar {

    public static void main(String[] args) {
        GeneralMotors gm= new GeneralMotors();
        gm.startCar();
        gm.wheelCar();
        gm.stopCar();
        gm.steerCar();
        System.out.println(gm.carModel);
        System.out.println(gm.brand);

        Tesla tesla= new Tesla();
        System.out.println(tesla.modelRating);
        System.out.println(tesla.selfAutoDriving);
        Tesla.teslaSpecialFeature();
        System.out.println(gm.brand);
        Car.carDoor(2);
        System.out.println(gm.carModel);
        System.out.println(GeneralMotors.carPrice);

        System.out.println(Car.price);
        System.out.println(Car.gasTank);
    }
    }

