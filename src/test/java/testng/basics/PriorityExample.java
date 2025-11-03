package testng.basics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 'L')
    public void testX(){
        System.out.println("Test X");
    }

    @Test(priority = 2, groups = "smoke")
    public void testB(){
        System.out.println("Test B");
    }

    @Test(priority = 3)
    public void testM(){
        System.out.println("Test M");
    }

    @Test(priority = 4)
    public void testG(){
        System.out.println("Test G");
    }

    @Test(priority = -5)
    public void testP(){
        System.out.println("Test P");
    }
}
