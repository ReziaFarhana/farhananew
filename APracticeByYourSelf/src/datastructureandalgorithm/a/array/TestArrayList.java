package array;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
//How to use user define class of object
    public static void main(String[] args) {

        //create 3 object of Employee class and pass value
        EmployeeInfo e1=new EmployeeInfo("Farhana", 40, "Eco");
        EmployeeInfo e2=new EmployeeInfo("Aurora", 8, "Grade 2");
        EmployeeInfo e3=new EmployeeInfo("Areeb", 6, "grade 1");

        //create ArrayList object

        ArrayList<EmployeeInfo> al=new ArrayList<EmployeeInfo>();
       //define generic, we can't use Data Type
        // as we want to use all object of EmployeeInfo class. so, we will use Employee Class

        al.add(e1);
        al.add(e2);
        al.add(e3);
        //to retrieve value we will use iterator
        Iterator<EmployeeInfo> it=al.iterator();
            while (it.hasNext()){//has.next method will check if in this employee iterator,
                                 // next values available or not. If it has 1st value then it will go to it.next method
                EmployeeInfo emp=it.next();//next() method will give e1 object
                System.out.println(emp.name);
                System.out.println(emp.age);
                System.out.println(emp.dept);
            }

            }


    }

