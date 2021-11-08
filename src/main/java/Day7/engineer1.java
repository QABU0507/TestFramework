package Day7;

public class engineer1 extends BaseArithmetic {

    //using interitance, we can use methods in the class Base Arithmetic--so, engineer1, engineer2 are child classes
    public int division(int a, int b)
    {
        return a/b;
    }

    //This method will have precedence over the sum method in baseArithmetic class
   /* public int add(int a, int b)
    {
        return a+b+15;
    }*/

    //using super keyword
    public int add(int a, int b)
    {   //method overriding: when a class extends another class and has same method in both class. here super class method is overridden: runtime polymorphism
        return super.add(a,b) +15;
    }

}
