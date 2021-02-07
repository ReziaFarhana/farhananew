package learnoop.encapsulation;

public class Pizza {

    public String pizzaName;
    private String pizzaTopping;
    private int pizzaPrice;
    private char pizzaSize;
    private String typeOfPizza;
    private boolean isAvailable;


    //Default Constructor:
    public void pizza(){}

    public Pizza() {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String pizzaTopping) {
        this.pizzaName = pizzaName;
        this.pizzaTopping = pizzaTopping;
    }

    public Pizza(String pizzaName, String pizzaTopping, int pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaTopping = pizzaTopping;
        this.pizzaPrice = pizzaPrice;
    }

    public Pizza(String pizzaName, String pizzaTopping, int pizzaPrice,
                 char pizzaSize, String typeOfPizza, boolean isAvailable) {
        this.pizzaName = pizzaName;
        this.pizzaTopping = pizzaTopping;
        this.pizzaPrice = pizzaPrice;
        this.pizzaSize = pizzaSize;
        this.typeOfPizza = typeOfPizza;
        this.isAvailable = isAvailable;
    }

    //Getter & Setter

    //Getter : return type
    public String getPizzaTopping(){
        return pizzaTopping;
    }
    //Setter Method: Non Return Type
    //Connect Global variable with method by using this
    public void setPizzaTopping(String pizzaTopping) {
        this.pizzaTopping = pizzaTopping;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public char getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(char pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

