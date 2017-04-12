package com.meeting.sample;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class App2Test {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("I am in beforeClass2"+"\n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("\n"+"I am in afterClass2");
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


    public void isExpected(int x, int y) {
        if (x == y)
            System.out.println("Correct2");
        else
            System.out.println("Incorrect2");


}
    }