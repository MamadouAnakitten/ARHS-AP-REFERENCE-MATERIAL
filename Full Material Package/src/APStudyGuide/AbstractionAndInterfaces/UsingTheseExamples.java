package APStudyGuide.AbstractionAndInterfaces;

/**
 * This class shows an example of everything to be learned in the abstraction methods.
 */
public class UsingTheseExamples extends ExampleAbstract implements ExampleInterface {

    /**
     * The subclass will have to inherit this constructor. Even if they want something else.
     *
     * @param seed SEED!
     */
    public UsingTheseExamples(String seed) {
        super(seed);
    }

    @Override
    public int getHyperI() {
        return 0;
    }

    @Override
    public int getSuperInt(int i) {
        return 0;
    }

    /**
     * Like every other method here, it HAD to be inherited from the interfaces and abstract class it is implementing
     * and extending. You can also see how ExampleEnum is being used.
     *
     * @param str
     * @return
     */
    @Override
    public String getSuperString(String str) {
        if(isSuper()) return ExampleEnum.SUPERSTRING.toString();
        return String.valueOf(Double.NEGATIVE_INFINITY);
    }

    @Override
    public int getHyperInt(int i) {
        return 0;
    }

    @Override
    public String getHyperString(String str) {
        return null;
    }
}
