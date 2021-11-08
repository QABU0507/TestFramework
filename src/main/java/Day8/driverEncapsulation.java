package Day8;

public class driverEncapsulation {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        //en.SetAge(23);  error occurs because age is private and set method is commented out.
        //if u uncomment the set age method and call it here we can set the age

        System.out.println(en.getAge());

        System.out.println(en.getAgeStatus());


    }
}
