package Day20_Framework.Commons;

import com.aventstack.extentreports.ExtentTest;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;



public class Assertor extends SoftAssert {
    //day 27 content
    private ExtentTest test;
    public Assertor(ExtentTest test){
        this.test=test;
    }
    @Override
    public void onAssertSuccess(IAssert<?> assertCommand) {
        if (assertCommand.getMessage().contains("#")) {
            LogUtil.info(assertCommand.getMessage().split("#")[0]);
            ReportUtil.fail(test, assertCommand.getMessage().split("#")[0], assertCommand.getMessage().split("#")[1].split("expected")[0].trim());
        } else {
            LogUtil.info(assertCommand.getMessage());
            ReportUtil.fail(test,assertCommand.getMessage());
        }
    }
    @Override  //to inform user that we are overriding an existing method
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        if (ex.getMessage().contains("#")) {
            LogUtil.error(ex.getMessage().split("#")[0]);
            ReportUtil.fail(test, ex.getMessage().split("#")[0], ex.getMessage().split("#")[1].split("expected")[0].trim());
        } else {
            LogUtil.error(ex.getMessage());
            ReportUtil.fail(test,ex.getMessage());
        }
    }

}
