package Day10;

import java.util.*;

public class hashSets {
    public static void main(String[] args) {
        //Set<> al =new HashSet<>(); it accepts value of all type(int, char,string etc)
        Set<String> al =new HashSet<String>(); // creating object for the Set and map it to the interface-set
        al.add("India");
        al.add("Canada");
        al.add("China");
        al.add("USA");
        al.add("Australia");
        //al.add("India"); duplicates are not allowed.. not sort or maintain insertion order

        //System.out.println(al.get(0));  // prints "India"

        Iterator<String> iter =al.iterator();  // helps to print all the values in the arraylist
        while(iter.hasNext())                  //hasNext() is a boolean.. it says whether there is next value in a arraylist
        {
            String country = iter.next();
            System.out.println(country);
        }
    }
}


