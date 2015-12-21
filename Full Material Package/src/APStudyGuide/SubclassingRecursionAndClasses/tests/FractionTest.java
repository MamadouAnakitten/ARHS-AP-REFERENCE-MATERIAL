package APStudyGuide.SubclassingRecursionAndClasses.tests;

import APStudyGuide.SubclassingRecursionAndClasses.Fraction;

import static org.junit.Assert.*;

/**
 * Example of a test class to test functionality and expected results.
 */
public class FractionTest {

    /**
     * Here is an example of a Java test case. As you can see, I manually went through and asserted different scenarios that might
     * arise and I'm hoping that I have written code that will properly handle strange events. I start with the test case original,
     * then I give what is expected to be returned by the program. I then call a function that tests to see if they are equal and if
     * not, JUnit will let you know something is wrong. You might thing, man, couldn't I just write test methods to test it in the
     * program and erase it later?
     * @throws Exception
     */
    @org.junit.Test
    public void testSimplify() throws Exception {
        Fraction originalFraction = new Fraction(4, 18);
        Fraction expectedFraction = new Fraction(2, 9);

        originalFraction.forceSimplify();

        assertEquals("4/18 is equal to 2/9. Simplified.", originalFraction, expectedFraction);

        originalFraction = new Fraction(18, 4);
        expectedFraction = new Fraction(9, 2);

        originalFraction.forceSimplify();

        assertEquals("Improper 18 / 4 is equal to improper 9 / 2", originalFraction, expectedFraction);

        originalFraction = new Fraction(0, 53);
        expectedFraction = new Fraction(0, 1);

        originalFraction.forceSimplify();

        assertEquals("0 / 53 is an infinite fraction.", originalFraction, expectedFraction);

        originalFraction = new Fraction(43, 0);
        expectedFraction = new Fraction(0, 0);

        originalFraction.forceSimplify();
        assertEquals("43 / 0 is an error producing fraction.", originalFraction, expectedFraction);
    }

    /*
        Try implementing some of your own tests here! See if you can break the fraction.
     */

    @org.junit.Test
    public void testGetNumerator() throws Exception {

    }

    @org.junit.Test
    public void testSetNumerator() throws Exception {

    }

    @org.junit.Test
    public void testGetDenominator() throws Exception {

    }

    @org.junit.Test
    public void testSetDenominator() throws Exception {

    }

    @org.junit.Test
    public void testGCD() throws Exception {

    }

    @org.junit.Test
    public void testToMixedNumber() throws Exception {

    }

    @org.junit.Test
    public void testAdd() throws Exception {

    }

    @org.junit.Test
    public void testSubtract() throws Exception {

    }

    @org.junit.Test
    public void testDivide() throws Exception {

    }

    @org.junit.Test
    public void testMultiply() throws Exception {

    }

    @org.junit.Test
    public void testPower() throws Exception {

    }

    @org.junit.Test
    public void testRoot() throws Exception {

    }
}
