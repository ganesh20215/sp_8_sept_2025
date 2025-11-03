package testng.basics;

import org.testng.annotations.Test;

public class InvocationCountExample {


    @Test(invocationCount = 10000, invocationTimeOut = 1000000, groups = "smoke")
    public void countExample() {
        System.out.println("Hello People..");
    }
}
