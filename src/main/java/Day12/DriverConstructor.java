package Day12;

public class DriverConstructor {
    public static void main(String[] args) {
        LearnConstructors Lcons = new LearnConstructors(); // LearnConstructors() will create a constructor by default
        //setval method sets the value of a and b. but this can be achieved using a constructor
        Lcons.setval(10,20);
        System.out.println(Lcons.sum());

        //using parameterized constructor
        LearnConstructors Lcons1 = new LearnConstructors(20, 30);
        System.out.println(Lcons1.sum());

        //using default constructor
        LearnConstructors Lcons2 = new LearnConstructors();
        System.out.println(Lcons2.sum());
    }
}
