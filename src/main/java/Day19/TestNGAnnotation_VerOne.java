package Day19;

import org.testng.annotations.*;

public class TestNGAnnotation_VerOne {
    @BeforeSuite(groups ={"Smoke","E2E"}) // if u give group nmae in the flower brackets only those things will be considered while run
    public void t1(){
        System.out.println("Before suite");
    }
    @AfterSuite(groups ={"Smoke","E2E"})
    public void t2(){
        System.out.println("After suite");
    }

    @BeforeTest(groups ={"Smoke","E2E"})
    public void t3(){
        System.out.println("Before Test");
    }
    @AfterTest(groups ={"Smoke","E2E"})
    public void t4(){
        System.out.println("After Test");
    }
    @BeforeGroups(groups ={"Smoke","E2E"})
    public void t5(){
        System.out.println("Before Groups");
    }
    @AfterGroups(groups ={"Smoke","E2E"})
    public void t6(){
        System.out.println("After Groups");
    }
    @BeforeClass(groups ={"Smoke","E2E"})
    public void t7(){
        System.out.println("Before class");
    }
    @AfterClass(groups ={"Smoke","E2E"})
    public void t8(){
        System.out.println("After class");
    }
    @BeforeMethod(groups ={"Smoke","E2E"})
    public void t9(){
        System.out.println("Before Method");
    }
    @AfterMethod(groups ={"Smoke","E2E"})
    public void t10(){
        System.out.println("After Method");
    }


    @Test(priority = 2, groups = "Smoke")
    public void t11(){
        System.out.println("Smoke");
    }

    @Test(priority = 1, groups = "E2E")
    public void t12(){
        System.out.println("E2E");
    }

    /* In testng.xml , we can include and exclude groups

    <groups>
            <run>
                <include name="E2E"/>
                <exclude name="Smoke"></exclude>
            </run>
        </groups>

        have included the above lines under Test tag

     */
}
