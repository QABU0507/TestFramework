package Day23.DataProviders;

import org.testng.annotations.DataProvider;

public class DP_Login {
    @DataProvider(name = "InvalidLoginData")
    public static Object[][] dataprovider() {

        return new Object[][]{
                {"Aish", "ABC1234"}, //each testdata- 2 values: Aish & ABC1234-- based on the values, there will be parameters in method
                {"Sri", "ASR927"},
                {"Home", "QII88"}
        };
    }

}
