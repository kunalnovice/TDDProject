package com.meeting.sample;


 import org.junit.AfterClass;
 import org.junit.BeforeClass;
 import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("I am in beforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("I am in afterClass");
    }

    @Test
    public void testSum()
    {
        int num1 = 5;
        int num2 = 6;
        int expected = 11;
        App a = new App();
        int appReturnedValue = a.returnSum(num1, num2);
        isExpected(appReturnedValue, expected);
    }

    @Test
    public void testSomething()
    {
         System.out.println("some test");

    }


    public void isExpected(int x, int y) {
        if (x == y)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");


}
    }