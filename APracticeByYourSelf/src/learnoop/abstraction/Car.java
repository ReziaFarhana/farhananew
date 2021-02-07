package learnoop.abstraction;

public interface Car {
    //In interface all values are final. can't change its value.
    //Interface is 100% abstract

    String car="Toyota";//we can't only declare a variable
                        // but we have to declare and assign value at the same time.
     //Static String price ="23000";//we can't declare Static
    String price ="23000";

        //We can declare another interface inside an interface.
       public interface NewCar {
            public void carRoof();

            //public void display(){}// we can't create a method with a body{} inside an interface

            public void display();//We can create a method without body so that we can use it in future
        }


        public static void carDoor(){} //If we declare a method static we can create its body{}


        //Create variable:

        String brand= "Mercedes";
        int carQuantity=200;
        String seat="4";
        String headLight="4";
        Boolean gasTank=true;

        //Create Methods: these are abstract method as interface is 100% abstract
        // anything inside interface is abstract
        // though we didn't use abstract keyword.
        //Abstract methods don't have body.
        public void startCar();
        public void stopCar();
        public void wheelCar();
        public void steerCar();
        public void carRoof();

    //Parameterized static method:
    public static int carDoor(int doorNumber){
        int totalDoor=doorNumber;
        System.out.println("This car has total door " + totalDoor);
        return totalDoor;
    }
}

