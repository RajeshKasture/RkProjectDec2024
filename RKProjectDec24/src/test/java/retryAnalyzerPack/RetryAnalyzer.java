package retryAnalyzerPack;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static final int maxRetry = 2; // Retry up to 2 times

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxRetry) {
            count++;
            return true; // Retry the test
        }
        return false; // Stop retrying
    }
}
