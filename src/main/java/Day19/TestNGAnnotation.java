package Day19;

import org.testng.annotations.*;

public class TestNGAnnotation {

    @BeforeSuite
    public void t1(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public void t2(){
        System.out.println("After suite");
    }

    @BeforeTest
    public void t3(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void t4(){
        System.out.println("After Test");
    }
    @BeforeGroups
    public void t5(){
        System.out.println("Before Groups");
    }
    @AfterGroups
    public void t6(){
        System.out.println("After Groups");
    }
    @BeforeClass
    public void t7(){
        System.out.println("Before class");
    }
    @AfterClass
    public void t8(){
        System.out.println("After class");
    }
    @BeforeMethod
    public void t9(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void t10(){
        System.out.println("After Method");
    }

    // @test is main for the before annotations to run. without @Test we cannot use before annotations
    @Test(priority = 2) // based on the priority @Test will run
    public void t11(){
        System.out.println("Script 1");
    }

    @Test(priority = 1)
    public void t12(){
        System.out.println("Script 2");
    }
}
