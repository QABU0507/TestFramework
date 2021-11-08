package Day12;

public class LearnConstructors {
    int a;
    int b;
    //default Constructor
    public LearnConstructors()
    {
        this.a =10;
        this.b =20;
    }
   //parameterized constructor
    public LearnConstructors(int a, int b)
    {
       this.a=a;
       this.b=b;
    }

    //method to set value--instead we can use constructor
    public void setval(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public int sum()
    {
        return a+b;
    }
}
