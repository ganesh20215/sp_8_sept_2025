package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(description = "Verify login with valid credentials", groups = "smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test(enabled = false)
    public void verifyAccountCreation(){
        System.out.println("Account Creation");
    }
}
