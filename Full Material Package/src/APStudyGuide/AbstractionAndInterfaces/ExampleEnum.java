package APStudyGuide.AbstractionAndInterfaces;

/**
 * An enum that gives a label to some program verbiage.
 */
public enum ExampleEnum {
    SUPERINT("A super-sized int, big enough for supercomputer calculations."),
    SUPERDOUBLE("A super-sized double for infinitely precise floating-point operations."),
    SUPERSTRING("A new format of string that can intelligently connect characters of multiple languages."),
    HYPERINT("A hyper int uses a flexible amount of memory per instance and can contain infinitely massive integers with HYPER RAM."),
    HYPERDOUBLE("A hyper double uses a flexible amount of memory per instance and can contain infinitely massive doubles with HYPER RAM."),
    HYPERSTRING("A hyper string can do infinitely fast string sub and search operations as well as interlingual correlation.");

    private final String desc;

    ExampleEnum(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
