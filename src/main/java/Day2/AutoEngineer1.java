package Day2;

public class AutoEngineer1 {
    public static void main(String[] args) {
        CommonArithmetics A = new CommonArithmetics();
        int sum =  A.Add(10,5);
        System.out.println(sum);

        int sub = A.Sub(10,5);
        System.out.println(sub);

        int mul = A.Mul(10,5);
        System.out.println(mul);

        A.increment();
        System.out.println(A.j);
        System.out.println(CommonArithmetics.k);

        CommonArithmetics C=new CommonArithmetics();
        C.increment();
        System.out.println(C.j);
        System.out.println(CommonArithmetics.k);
    }
}
