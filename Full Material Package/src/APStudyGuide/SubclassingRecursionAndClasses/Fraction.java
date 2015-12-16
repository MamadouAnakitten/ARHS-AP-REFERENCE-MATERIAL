package APStudyGuide.SubclassingRecursionAndClasses;

/**
 * Simple fraction class.
 */
public class Fraction {

    protected int numerator;
    protected int denominator;

    /**
     * Can be constructed by a numerator and denominator.
     * @param numerator Numerator
     * @param denominator Denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Can also be constructed with a mixed number.
     * @param mixedNumber Mixed number
     */
    public Fraction(MixedNumber mixedNumber) {
        this.numerator = mixedNumber.toFraction().getNumerator();
        this.denominator = mixedNumber.toFraction().getDenominator();
    }

    /**
     * Protected method passed down to be overridden. Simplifies the fraction at hand.
     */
    protected void simplify() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the numerator value.
     * @return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Set the numerator value. Will automatically simplify.
     * @param numerator Numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    /**
     * Get the denominator value.
     * @return Denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Set the denominator value. Will automatically simplify.
     * @param denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }

    /**
     * Recursive static method that helps find the greatest common divisor.
     * @param a
     * @param b
     * @return
     */
    public static int GCD(int a, int b) {
        /*
        * Recursive functions are very useful when it comes to operations like this:
        *
        * I need to find the greatest common divisor to simplify a fraction. If I send in a, the numerator,
        * and b, the denominator, it will keep dividing until it finds a remainder that can be divided into both numbers.
        * */

        //Base case / return case
        if(b == 0) {
            return a;
        }

        //Call to self
        return GCD(b, a % b);
    }
}
