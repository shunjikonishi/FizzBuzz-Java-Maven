package com.github.skohar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testFizzBuzz() {
        for (int i = 1; i <= 1000; i++) {
            assertEquals(App.fizzBuzz(i), answer(i));
        }
    }

    private static String answer(int n) {
        return n % 15 == 0 ? "FizzBuzz" : n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : Integer.toString(n);
    }
}
