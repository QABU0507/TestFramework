package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        //List<> al =new ArrayList<>(); it accepts value of all type(int, char,string etc)
        List<String> al =new ArrayList<String>(); // creating object for the array list and map it to the interface-(List)
        al.add("India");
        al.add("Canada");
        al.add("China");
        al.add("USA");
        al.add("Australia");

        al.add(2,"Africa");//inserts data
        System.out.println(al.contains("canada"));//finds an value

        System.out.println(al.get(0));  // prints "India"

        Iterator<String> iter =al.iterator();  // helps to print all the values in the arraylist
        while(iter.hasNext())                  //hasNext() is a boolean.. it says whether there is next value in a arraylist
        {
            String country = iter.next();
            System.out.println(country);
        }
    }
}
