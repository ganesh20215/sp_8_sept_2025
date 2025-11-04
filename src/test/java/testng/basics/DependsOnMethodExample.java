package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
    
    }

    @Test
    public void verifyAccountCreation(){
        System.out.println("Account Creation");
    }
}

