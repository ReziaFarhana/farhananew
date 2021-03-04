package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> seasonName = new LinkedList<>();
		//use of add
		seasonName.add("Summer");
		seasonName.add("Winter");
		seasonName.add("Fall");
		seasonName.add("Spring");

		//to retrieve all values use of for loop
		for (String st : seasonName) {
			System.out.println("Season's name is " + st);
		}
		//remove
		System.out.println("*******after remove***********");
		seasonName.remove("Fall");
		for (String st1 : seasonName) {
			System.out.println("Season name is " + st1); }
		//peek
		System.out.println(seasonName.peek());
		System.out.println("**********after peek********");
		for (String st2 : seasonName) {
			System.out.println("Season Name is " + st2); }

		//poll
		System.out.println(seasonName.poll());
		System.out.println("************* after Poll********");

		//while loop
		System.out.println("******While loop with Iterator********");
		Iterator it =seasonName.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}




