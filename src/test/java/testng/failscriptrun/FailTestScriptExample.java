package testng.failscriptrun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestScriptExample {

     @Test
    public void method1(){
        System.out.println("Method 1");
    }

     @Test
    public void method2(){
        Assert.assertTrue(false);
        System.out.println("Method 2");
    }

     @Test
    public void method3(){
        System.out.println("Method 3");
    }

     @Test
    public void method4(){
        System.out.println("Method 4");
    }
}
