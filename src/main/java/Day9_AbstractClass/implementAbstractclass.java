package Day9_AbstractClass;

public class implementAbstractclass extends abstractClass{
    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return i-j;
    }

    public int divide(int i, int j)
    {
        return i/j;
    }

}
