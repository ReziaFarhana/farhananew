package learnqueue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<String> shoppingList = new PriorityQueue<>();
        shoppingList.add("T-shirt");
        shoppingList.add("Shoes");
        shoppingList.add("Bag");
        shoppingList.add("Belt");
        shoppingList.add("Car");

        System.out.println("************ retrieve all *****");
        for (String sl : shoppingList) {
            System.out.println("My shoppingList is " + sl);
        }
        System.out.println(shoppingList.peek());
        System.out.println("***************remove*********");
        System.out.println(shoppingList.remove());

        for (String sl : shoppingList) {
            System.out.println("My shoppingList is " + sl);
        }


    }
}
