package com.meeting.sample;


import org.junit.runner.JUnitCore;

/**
 * Created by ashvimehta on 07/04/2017.
 */
public class SuiteRunner {
    public static void main (String args[]) {
        JUnitCore.runClasses(TestSuite.class);
    }
}
