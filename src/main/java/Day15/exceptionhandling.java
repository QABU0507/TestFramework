package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionhandling {
    public static void main(String[] args)  {

        //Checked exception
       /* try {
            Thread.sleep(4000);  // throws interrupted exception.
            // Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted,
            // either before or during the activity.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            new FileInputStream("iuwreiweuri"); // it throws file not found exception- if file not found
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //unchecked exception
        //In the below case, we are not sure, we will get exception
        //we will get exception only when we run the program.-- we will get ArrayIndexout of Bound Exception
        String str[]=new String[3];
        str[3]="Aishwarya";
        System.out.println(str[3]);
        */

        //Adding signature as throws Exception in main will handle the exception. the other way is using try catch

        ageCalculator age = new ageCalculator();
        try{
            String str=null;
            System.out.println(str.length()); // throws null pointer exception(if there  is no catch block for this it will execute exception catch block)
            int half = 2/0;  //throws arithmetic exception
            age.ageCalc(2);
        }
        catch (ArithmeticException e){
            System.out.println("The Arithmatic exception is "+e.toString());
        }
        catch(NullPointerException e){
            System.out.println("The Null Pointer exception "+e.toString());
            e.printStackTrace();//will print the exact exception in red/maroon font
        }
        catch (Exception e){
            System.out.println("The exception is "+e.toString());
        }
        finally{
            System.out.println("Finally block will be executed always"); // use: we can use this block to execute all the necessary steps e.g saving, closing excel.etc..,
        }
        // we can write try catch in finally block, catch block
        System.out.println("End of program");
    }
}
