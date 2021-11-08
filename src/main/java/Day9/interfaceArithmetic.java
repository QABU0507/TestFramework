package Day9;

public interface interfaceArithmetic {
    public int add(int i, int j);

    public int sub(int i, int j); // Abstract method-cannot have method definition.we cannot open curly braces.we will get error


}

/*Notes: if u want to force all the users to use the same methods and definitions we can use interface class.
when u have to define methods of ur own to be used commonly by all users, we can use abstract class.
 */