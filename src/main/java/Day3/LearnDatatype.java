package Day3;

public class LearnDatatype {
    public static void main(String[] args) {

    // Interger datatypes
        byte b = 127;
        System.out.println(b);

        Short s = 12000;
        System.out.println(s);

        int i = 1232423435;
        System.out.println(i);

        long l = 112384738473775743l;
        System.out.println(l);

    // floating point
        float f = 9.2384873242843f;
        System.out.println(f);

        double d = 7.8348728723858257845;
        System.out.println(d);

    // Character
        char c = 'S';
        System.out.println(c);

    // Boolean
        boolean bo = true;
        System.out.println(bo);

    // wrapper class-used to convert from one data type to another data type

        String str = "2343.987";
        double d1 = Double.parseDouble(str);
        System.out.println(d1);

    }
}
