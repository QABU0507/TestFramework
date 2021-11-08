package Day10;

public class Arrays {
    public static void main(String[] args) {
        //single dimensional array
        String[] sarray = new String[5];
        sarray[0]="India";
        sarray[1]="Canada";
        sarray[2]="ramesh";
        sarray[3]="Ambiga";
        sarray[4]="Ghukhan";

        System.out.println(sarray[1]);


        for(int i=0;i<sarray.length;i++)
        {
            System.out.println(sarray[i]);
        }

        // to find a element present in array
        for(int i=0;i<sarray.length;i++)
        {
            if(sarray[i].equals("Canada"))
            System.out.println("Canada is present");
        }


        //multi dimensional array
        String[][][] marray = new String[3][2][1];
        marray[0][0][0]="India";
        marray[0][1][0]="Canada";

        marray[1][0][0]="US";
        marray[1][1][0]="Russia";

        marray[2][0][0]="Italy";
        marray[2][1][0]="Australia";

        System.out.println(marray[0][1][0]);


    }
}
