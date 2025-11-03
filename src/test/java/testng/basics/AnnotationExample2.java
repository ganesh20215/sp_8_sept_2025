package testng.basics;

import org.testng.annotations.*;

public class AnnotationExample2 {



    @BeforeMethod
    public void set(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void down(){
        System.out.println("After Method");
    }

    @Test
    public void testCase1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @BeforeClass
    public void bClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void aClass(){
        System.out.println("After Class");
    }

    @BeforeTest
    public void bTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void aTest(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void bSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void aSuite(){
        System.out.println("After Suite");
    }
}
