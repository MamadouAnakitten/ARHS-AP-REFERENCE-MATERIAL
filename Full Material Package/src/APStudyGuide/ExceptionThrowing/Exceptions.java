package APStudyGuide.ExceptionThrowing;

import APStudyGuide.SubclassingRecursionAndClasses.Fraction;
import APStudyGuide.SubclassingRecursionAndClasses.MixedNumber;
import Questions.PracticePromptSolutions.SparseArrays.SparseArray;

import java.util.ArrayList;

/**
 * There are a few exceptions that may show up on the exam. These are as follows:
 *
 * NullPointerException - Tried to make a call to a null memory reference.
 * ArrayIndexOutOfBoundsException - Tried to make reference to an array index that exceeded index bounds for an array.
 * ArithmeticException - Tried to perform a mathematical operation that is impossible.
 * ClassCastException - Tried to cast an object to an incompatible / impossible class.
 */
public class Exceptions {

    public static void throwNullPointer() {
        Fraction fraction = null;
        fraction.getDenominator();
    }

    public static void throwArrayIndexException() {
        int[] i = {3, 5, 2, 5};

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(2);
        ints.add(5);

        //Both will throw an ArrayIndexOutOfBoundException
        System.out.println(i[-1]);
        System.out.println(i[42]);

        ints.get(-1);
        ints.get(42);
    }

    public static void throwArithmeticException() {
        int j = 42 / 0;
    }

    public static void throwClassCastException() {
        MixedNumber mixedNumber = new MixedNumber(4, 13, 25);
        Fraction fraction;
        /*
        * This is a legal cast. A subclass can be referenced as it superclass, although, in this example
        * a mixed number class cast to fraction would cause it to lose the mixed number.
        * */
        fraction = (Fraction) mixedNumber;

        /*
        * This is not a legal cast. Integer is not a subclass of string, therefore it cannot be casted to String.
        * This will cause a ClassCastException.
        * */
        Object i = Integer.valueOf(42);
        String s = (String)i;
        //String s = String.valueOf(i); //Correct version
    }

    public static void main(String[] args) {
        //Exceptions.throwNullPointer();
        //Exceptions.throwArrayIndexException();
        //Exceptions.throwArithmeticException();
        //Exceptions.throwClassCastException();
    }
}
