package APStudyGuide.AbstractionAndInterfaces;

/**
 * An example of supercomputing abstract class.
 */
public abstract class ExampleAbstract {
    public int superI;
    private double superD;
    protected boolean superB;

    /**
     * The subclass will have to inherit this constructor. Even if they want something else.
     * @param seed SEED!
     */
    public ExampleAbstract(String seed) {
        this.superI = seed.length();
        this.superD = Math.pow(superI, 3);
        this.superB = false;
    }

    /**
     * This method is defined once here in the abstract class like a normal method. Buf it can be overridden in the subclass.
     * @return
     */
    public boolean isSuper() {
        return superB;
    }

    /**
     * Abstract definition for getting a hyper integer. All subclasses would handle this method.
     * @return Hyper integer!
     */
    public abstract int getHyperI();
}
