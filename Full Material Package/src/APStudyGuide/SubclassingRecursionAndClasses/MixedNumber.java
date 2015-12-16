package APStudyGuide.SubclassingRecursionAndClasses;

/**
 * Very simple mixed number class. This simply shows proper subclassing technique, with respects to
 * method overriding from the super class as well as privatization using protected. This also shows how to
 * implement constructor overloading.
 */
public class MixedNumber extends Fraction {

    /*
    * You may note that I have access to numerator and denominator throughout this class, and I do not have
    * to call getNumerator() or getDenominator(). This is because they have protected access which means they are
    * fully accessible in this class and any subclasses of this class.
    * */
    protected int whole;

    /*
    * You will also see I have three different constructors for three different ways to create a mixed number.
    * Each way will handle setting up the class differently, but you will see that all of them call the constructor
    * of the super class. If your super-class only has contructors that take arguments, you HAVE to call the constructor
    * in all constructors of any sub-classes of that class.
    * */

    /**
     * This constructor defines MixedNumber as a whole number and a fraction.
     * @param whole Whole number of the mixed number.
     * @param fraction Fractional part of the mixed number.
     */
    public MixedNumber(int whole, Fraction fraction) {
        super(fraction.numerator, fraction.denominator);
        this.whole = whole;
        simplify();
    }


    /**
     * This constructor defines MixedNumber by defining each part separately.
     * @param whole Whole number of the mixed number.
     * @param numerator Numerator to the fractional part.
     * @param denominator Denominator to the fractional part.
     */
    public MixedNumber(int whole, int numerator, int denominator) {
        super(numerator, denominator);
        this.whole = whole;
        simplify();
    }

    /**
     * This constructor defines MixedNumber by defining only a numerator and a denominator.
     * @param numerator
     * @param denominator
     */
    public MixedNumber(int numerator, int denominator){
        super(numerator, denominator);
        simplify();
    }

    /*
    * Here is an example of super method overriding. Or simply, replacing the function of a
    * method in the superclass.
    * */
    @Override
    protected void simplify() {
        Fraction improperFraction = toFraction();
        if(improperFraction.numerator > improperFraction.denominator) {
            whole = 0;
            numerator = improperFraction.numerator;
            denominator = improperFraction.denominator;
        } else if(improperFraction.numerator == improperFraction.denominator) {
            whole = 1;
            numerator = 0;
            denominator = 0;
        } else {
            whole = Math.floorDiv(improperFraction.numerator, improperFraction.denominator);
            numerator = improperFraction.numerator % improperFraction.denominator;
            denominator = improperFraction.denominator;
        }
    }

    /**
     * Returns the whole component of the mixed number.
     * @return Whole number component.
     */
    public int getWhole() {
        return whole;
    }

    /**
     * Set the whole number component.
     * @param whole Whole number component.
     */
    public void setWhole(int whole) {
        this.whole = whole;
        simplify();
    }

    /**
     * Return the fractional component as a fraction.
     * @return Fractional component
     */
    public Fraction getFractionalPart() {
        return new Fraction(numerator, denominator);
    }

    /**
     * Converts the whole number to an improper fraction.
     * @return Improper fraction
     */
    public Fraction toFraction() {
        if(whole != 0) {
            return new Fraction(((numerator * whole) + denominator), (denominator));
        }

        return new Fraction(numerator, denominator);
    }
}
