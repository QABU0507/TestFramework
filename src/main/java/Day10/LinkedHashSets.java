package Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    public static void main(String[] args) {
        //Set<> al =new LinkedHashSet<>(); it accepts value of all type(int, char,string etc)
        Set<String> al = new LinkedHashSet<String>(); // creating object for the Set and map it to the interface-Set
        al.add("India");
        al.add("Canada");  //no sorting .. removes duplicates..maintains the insertion order.
        al.add("China");
        al.add("USA");
        al.add("Australia");
        //al.add("India"); duplicates are not allowed

        //System.out.println(al.get(0));  // prints "India"

        Iterator<String> iter = al.iterator();  // helps to print all the values in the arraylist
        while (iter.hasNext())                  //hasNext() is a boolean.. it says whether there is next value in a arraylist
        {
            String country = iter.next();
            System.out.println(country);
        }
    }
}
