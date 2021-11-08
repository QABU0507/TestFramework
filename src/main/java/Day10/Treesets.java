package Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treesets {
    public static void main(String[] args) {
        //Set<> al =new TreeSet<>(); it accepts value of all type(int, char,string etc)
        Set<String> al =new TreeSet<String>(); // creating object for the set and map it to the interface-Set
        al.add("India");
        al.add("Canada");
        al.add("China");
        al.add("USA");
        al.add("Australia");// will get sorted automatically
        //al.add("India"); duplicates are not allowed

        //System.out.println(al.get(0));  // prints "India"

        Iterator<String> iter =al.iterator();  // helps to print all the values in the arraylist
        while(iter.hasNext())                  //hasNext() is a boolean.. it says whether there is next value in a arraylist
        {
            String country = iter.next();
            System.out.println(country);
        }
    }
}
