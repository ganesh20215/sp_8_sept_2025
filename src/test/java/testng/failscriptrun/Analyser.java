package testng.failscriptrun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyser implements IRetryAnalyzer {

    int startTest = 0;
    int endTest = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (startTest < endTest){
            startTest++;
            return true;
        }
        return false;
    }
}
