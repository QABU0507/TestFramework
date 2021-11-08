package Day9_AbstractClass;

import Day9.implementArithmetic;
import Day9.interfaceArithmetic;

public class driverAbstractclass {
    public static void main(String[] args) {

        //creating object for class
        implementAbstractclass ia = new implementAbstractclass();
        System.out.println(ia.add(1,3));
        System.out.println(ia.sub(3,1));
        System.out.println(ia.multiply(3,2));
        System.out.println(ia.divide(3,2));

        //creating object for interface
        abstractClass ia1 = new implementAbstractclass();
        System.out.println(ia1.add(1,3));
        System.out.println(ia1.sub(3,1));
        System.out.println(ia1.multiply(3,1));

       /* cannot access divide method because not mentioned in abstract class
        System.out.println(ia1.divide(3,2));*/
    }
}
