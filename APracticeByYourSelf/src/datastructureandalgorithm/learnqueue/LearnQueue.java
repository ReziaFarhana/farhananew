package learnqueue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

        //Queue : is a waiting list
        //step:1: creating object

        Queue<String> name = new LinkedList<>();//Queue is an interface, String is the data type
        // and classOfConstructor is LinkedList method.
        //accessibility of a method depends on interface.
        //FIFO- First in first out

        //Step 2: assign value
        name.add("Aurora");
        name.add("Khushi");
        name.add("Nashwan");
        name.add("Tanvir");
        name.add("Tasmi");

        //to retrieve all values
        for (String st : name) {
            System.out.println("Candidate name is : " + st);
        }
            System.out.println("************** Add value*********");
            //to add value:
            name.add("Mamun");

            for (String st1 : name) {
                System.out.println("Candidate name is : " + st1);
            }


                System.out.println("********** Remove *****");

                name.remove("Mamun");

                System.out.println(name.element());//will show the 1st value

                System.out.println(name);

                System.out.println(name.peek());//will select the 1st value and remove it
                for (String st2: name)
                    System.out.println("candidate name is : " + st2);

                //Int Ques: difference between pull and peek
            // pull select first value and remove it but peek select the first value but don't remove the value.
        //remove: only delete the value from list.


            }
        }


