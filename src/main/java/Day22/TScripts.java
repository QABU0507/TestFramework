package Day22;

import Day22.Dp;
import org.testng.annotations.Test;

import java.util.Map;

public class TScripts {

    @Test(dataProvider = "LoginData", dataProviderClass = Dp.class,enabled = false)
    //if the dp class is in different package== <packagename>.Dp.class
    public void getUsernamePassword(String user, String password) {
        System.out.println(user);
        System.out.println(password);
    }

    @Test(dataProvider = "LoginDataExcel", dataProviderClass = Dp.class,enabled = false)
    //if the dp class is in different package== <packagename>.Dp.class
    public void getDataExcel(Map<String, String> hm) {

        System.out.println(hm.get("Name"));
        System.out.println(hm.get("City"));
        System.out.println(hm.get("State "));  //notice: State has a space next to it.. even space can make a differnece in output..
        //key given in the excel must exactly match with hm.get("State ")
        //System.out.println(hm.get("Block"));
        System.out.println(hm.get("Product"));
        //System.out.println(hm.get("package"));
        System.out.println(hm.get("Country"));
        //System.out.println(hm.get("pincode"));

        System.out.println("--------------------");
    }

    @Test(dataProvider = "LoginDataExcel1", dataProviderClass = Dp.class)
    public void getharddata(Map<String, String> hm1){
        System.out.println(hm1.get("Name"));
        System.out.println(hm1.get("city"));
        System.out.println(hm1.get("State "));

        System.out.println("--------------------");
    }
}


