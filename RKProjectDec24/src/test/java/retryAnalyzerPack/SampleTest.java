package retryAnalyzerPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testRetryLogic() {
        System.out.println("Executing test...");
        Assert.fail("Intentional failure"); // Test will be retried
    }
}

