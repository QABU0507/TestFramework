package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        //List<> al =new LinkedList<>(); it accepts value of all type(int, char,string etc..,)
        List<String> al =new LinkedList<String>(); // creating object for the list and map it to the interface-list
        //Generics-- String is a generic in the above line denoting that the list stores only string
        al.add("India");
        al.add("Canada");
        al.add("China");
        al.add("USA");
        al.add("Australia");

        System.out.println(al.get(0));  // prints "India"

        Iterator<String> iter =al.iterator();  // helps to print all the values in the arraylist
        while(iter.hasNext())                  //hasNext() is a boolean.. it says whether there is next value in a arraylist
        {
            String country = iter.next();
            System.out.println(country);
        }
    }
}
