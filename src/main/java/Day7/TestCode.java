package Day7;

public class TestCode {
    public static void main(String[] args) {

        //creating object for engineer1 class and calling methods of BaseArithmetic and engineer1 class
        engineer1 eng1 = new engineer1();
        System.out.println("ADD " + eng1.add(20,10));
        System.out.println("SUB " + eng1.sub(20, 15));
        System.out.println("DIV " + eng1.division(10,5));

        //creating object for engineer2 class and calling methods of BaseArithmetic and engineer2 class
        engineer2 eng2 = new engineer2();
        System.out.println("ADD " + eng2.add(20,10));
        System.out.println("SUB " + eng2.sub(20, 15));
        System.out.println("POW " + eng2.power(2,3));

    }
}
