package Day9;

public class implementArithmetic implements interfaceArithmetic{

    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return i-j;
    }

    public int multiply(int i, int j){
        return i*j;
    }
}
