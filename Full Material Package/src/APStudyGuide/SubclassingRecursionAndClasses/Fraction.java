package APStudyGuide.SubclassingRecursionAndClasses;

/**
 * Simple fraction class.
 *
 * Feel free to add some methods like mathematical operations and such! It's good exercise!
 */
public class Fraction {

    protected int numerator;
    protected int denominator;

    protected boolean isErrored;
    protected ERRORPRINTS error;

    /*
        This is an enum. There is a reading on enums else where in the abstraction unit. Check it out to see how
        enums can be personalized!
     */
    private enum ERRORPRINTS {
        INFINITE("\u221E / 1", 0, 1), DIV_BY_ZERO("N / A", 0, 0), NONE("", 0, 0);

        private String printString;
        public final int numeratorVal;
        public final int denominatorVal;

        ERRORPRINTS (String printString, int numeratorVal, int denominatorVal) {
            this.printString = printString;
            this.numeratorVal = numeratorVal;
            this.denominatorVal = denominatorVal;
        }

        @Override
        public String toString() {
            return printString;
        }
    }

    /**
     * Can be constructed by a numerator and denominator.
     * @param numerator Numerator
     * @param denominator Denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.error = ERRORPRINTS.NONE;
        isErrored = false;

    }

    /**
     * Can also be constructed with a mixed number.
     * @param mixedNumber Mixed number
     */
    public Fraction(MixedNumber mixedNumber) {
        this.numerator = mixedNumber.toFraction().getNumerator();
        this.denominator = mixedNumber.toFraction().getDenominator();
        this.error = ERRORPRINTS.NONE;
        isErrored = false;
    }

    /**
     * Protected method passed down to be overridden. Simplifies the fraction at hand. Includes strange event handling.
     */
    protected void simplify() {
        if (numerator == 0){
            isErrored = true;
            error = ERRORPRINTS.INFINITE;

            numerator = ERRORPRINTS.INFINITE.numeratorVal;
            denominator = ERRORPRINTS.INFINITE.denominatorVal;

            return;
        } if (denominator == 0) {
            isErrored = true;
            error = ERRORPRINTS.DIV_BY_ZERO;

            numerator = ERRORPRINTS.DIV_BY_ZERO.numeratorVal;
            denominator = ERRORPRINTS.DIV_BY_ZERO.denominatorVal;

            return;
        } if(numerator % denominator != 0) {
            int GCD = GCD(numerator, denominator);
            numerator /= GCD;
            denominator /= GCD;
            error = ERRORPRINTS.NONE;
            isErrored = false;
        }
    }

    public void forceSimplify() {
        simplify();
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

    public MixedNumber toMixedNumber() {
        if(numerator % denominator == 0){
            return new MixedNumber(numerator / denominator, 0, 0);
        } if (numerator > denominator) {
            return new MixedNumber(Math.floorDiv(numerator, denominator), numerator % denominator, denominator);
        }

        return new MixedNumber(0, numerator, denominator);
    }

    @Override
    public String toString() {
        if(isErrored) {
            return error.toString();
        }

        //Traditional AP way of string concatenation.
        //return (numerator + " / " + denominator);

        //The more efficient way of string concatenation.
        return new StringBuilder(numerator).append(" / ").append(denominator).toString();
    }

    @Override
    public boolean equals(Object obj) {
        Fraction frac = (Fraction)obj;
        if(frac.numerator == numerator && frac.denominator == denominator) return true;

        return false;
    }
}
