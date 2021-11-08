package Day2;

public class AutoEngineer2 {
    public static void main(String[] args) {
        CommonArithmetics B = new CommonArithmetics();
        int sum =  B.Add(15,5);
        System.out.println(sum);

        int sub = B.Sub(15,5);
        System.out.println(sub);

        int mul = B.Mul(15,5);
        System.out.println(mul);

        CommonArithmetics D = new CommonArithmetics();
        CommonArithmetics.decrement();                  //static method accessed using class name
        System.out.println(CommonArithmetics.m);

    }
}
