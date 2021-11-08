package Day9;

public class driverArithmetic {
    public static void main(String[] args) {
        //creating object for class
        implementArithmetic ia = new implementArithmetic();
        System.out.println(ia.add(1,3));
        System.out.println(ia.sub(3,1));
        System.out.println(ia.multiply(3,2));

        //creating object for interface
        interfaceArithmetic ia1 = new implementArithmetic();
        System.out.println(ia1.add(1,3));
        System.out.println(ia1.sub(3,1));
        /*cannot access multiply method because not mentioned in interface class
        System.out.println(ia1.multiply(3,2));*/

    }
}
