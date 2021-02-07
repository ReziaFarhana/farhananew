package learnoop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        System.out.println(TestPizza.minimum(10,12,15));

        //Object creation
        Pizza pizza=new Pizza();

        //When we create Getter & Setter we ist Create Getter & then Create Setter
        //But when we use ist we set/assign value then we call/get value.


        pizza.setPizzaTopping("Olives");
        System.out.println(pizza.getPizzaTopping());


        pizza.setPizzaPrice(25);
        System.out.println(pizza.getPizzaPrice());

        pizza.setAvailable(true);
        System.out.println(pizza.isAvailable());

        pizza.setPizzaSize('L');
        System.out.println(pizza.getPizzaSize());

        pizza.setTypeOfPizza("Sicilian");
        System.out.println(pizza.getPizzaPrice());

        }


    public static int minimum(int a, int b, int c){
        return Math.min(Math.min(a,b),c);

    }
}
