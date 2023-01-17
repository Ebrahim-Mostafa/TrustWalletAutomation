package retrylogic;


import com.oracle.tools.packager.Log;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer , ITestListener {

    private int retryCount = 0;
    // set the maxRetryCount to the number of retries
    private final int maxRetryCount = 0;

    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            Log.info("Retrying " + result.getName() + " test with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (retryCount+1) + " time(s).");
            retryCount++;
            return true;
        }
        return false;
    }

    public String getResultStatusName(int status) {
        String resultName = null;
        if(status==1)
            resultName = "SUCCESS";
        if(status==2)
            resultName = "FAILURE";
        if(status==3)
            resultName = "SKIP";
        return resultName;
    }
}
