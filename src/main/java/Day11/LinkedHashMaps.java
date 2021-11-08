package Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        Map<String,String> hm= new LinkedHashMap<String,String>();//creating object for the map and map it to the interface-Map
        hm.put("US","Washington"); // US- key, Washington-value
        hm.put("India","Chennai");
        hm.put("Canada","Ontario");
        hm.put("Russia","Moscow");
        //LinkedHashMap maintains insertion order
        System.out.println(hm.get("Canada"));//prints value - Ontario

        //run the iterator on the key
        Iterator<String> iter =hm.keySet().iterator();
        while(iter.hasNext())                  //hasNext() is a boolean.. it says whether there is next value in a arraylist
        {
            String Key = iter.next();
            String Value = hm.get(Key);
            System.out.println("Key: "+Key+" , Value: "+Value);
        }
    }
}
