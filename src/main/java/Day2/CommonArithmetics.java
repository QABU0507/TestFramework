package Day2;

public class CommonArithmetics {

    int j=0; //instance variable
    //Static variable explanation
    static int k=0;
    static int m=10;

    void increment() //non-static method accessing static and non-static variable
    {
        j++;
        k++;
    }

    static void decrement() //static method access only static variable
    {
        m--;
    }

    //Add method
    int Add(int num1, int num2)    //num1 and num2 are local variable
    {
        return num1+num2;
    }
    //sub method
    int Sub(int num1, int num2)
    {
        return num1-num2;
    }
    //multiply method
    int Mul(int num1, int num2)
    {
        return num1*num2;
    }


}
