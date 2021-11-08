package Day11_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomerDetails {
    public static void main(String[] args) {
        //This class gets and sets the customer details. we create object for the Hyundaicustomerinfo class
        //Customer 1
        HyundaiCustomerInfo CustInfo1= new HyundaiCustomerInfo();
        CustInfo1.setName("Aishwarya");
        CustInfo1.setState("Tamil Nadu");
        CustInfo1.setCity("Chennai");
        CustInfo1.setCarModel("i10");

        //To add and set multiple phonenumbers for a customer
        ArrayList<String> phoneNumbers = new ArrayList<String>();
        phoneNumbers.add("9829167230");
        phoneNumbers.add("9230471023");
        CustInfo1.setPhoneNumbers(phoneNumbers);

        //Customer 2
        HyundaiCustomerInfo CustInfo2= new HyundaiCustomerInfo();
        CustInfo2.setName("Ramesh");
        CustInfo2.setState("Kerala");
        CustInfo2.setCity("Kochin");
        CustInfo2.setCarModel("i20");
        //add and set multiple phonenumbers in a single statement
        CustInfo2.setPhoneNumbers(new ArrayList<String>(Arrays.asList("9012315489","7012045013")));

        //Customer 3
        HyundaiCustomerInfo CustInfo3= new HyundaiCustomerInfo();
        CustInfo3.setName("Ghukhan");
        CustInfo3.setState("Karnataka");
        CustInfo3.setCity("Bangalore");
        CustInfo3.setCarModel("Creda");

        CustInfo3.setPhoneNumbers(new ArrayList<String>(Arrays.asList("9012310189","9109845013")));

        //we set the customer data  in the above lines. To get the customer details, we are storing the above datas in a hashmap
        //<String, HyundaiCustomerInfo> - String--> name of the customer , HyundaiCustomerInfo--->refers the object created for each customer

        Map<String,HyundaiCustomerInfo> Customermap= new HashMap<String,HyundaiCustomerInfo>();
        Customermap.put("Aishwarya",CustInfo1); //put stores the data in a hashmap format
        Customermap.put("Ramesh",CustInfo2);
        Customermap.put("Ghukhan",CustInfo3);

        //To get the customer details
        System.out.println(Customermap.get("Aishwarya").getState());
        System.out.println(Customermap.get("Aishwarya").getCity());
        System.out.println(Customermap.get("Aishwarya").getCarModel());
        System.out.println(Customermap.get("Aishwarya").getPhoneNumbers());

        /* if u want to get the customer name from the user. use scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name:")
        String Customername = sc.nextLine();

        System.out.println(Customermap.get(Customername).getState());
        System.out.println(Customermap.get(Customername).getCity());
        System.out.println(Customermap.get(Customername).getCarModel());
        System.out.println(Customermap.get(Customername).getPhoneNumbers());

         */

    }
}

