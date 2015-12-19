package APStudyGuide.AbstractionAndInterfaces;

/**
 * An example interface for supercomputing!
 */
public interface ExampleInterface {

    /**
     * Every method must only have a return type, and arguments. A javadoc is also usually found. You should end
     * an abstract method with a semicolon.
     * @param i Integer parameter seed.
     * @return A super int!
     */
    int getSuperInt(int i);

    String getSuperString(String str);

    int getHyperInt(int i);

    String getHyperString(String str);


}
