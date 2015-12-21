/*
* Packages:
*   Where a file is within the subset of folders leading up to the class
*   In explorer, this generally looks like
*   /src/APStudyGuide/SubclassingRecursionAndClasses/Fraction.java
*   The package for that would be APStudyGuide.SubclassingRecursionAndClasses.Fraction
*
*   You can import everything from a package by doing this:
*   import APStudyGuide.*;
* */
package APStudyGuide;

import java.util.Random;

/**
 * This is an interactive study guide to help prepare yourself for the AP Computer Science A 2015 Exam.
 * This is not by any means official, but it uses information from the CollegeBoard AP website to tailor
 * a simple program of study around the exam material.
 *
 * To make use of this study guide, read up on the multi-line comments to be educated, then you can erase the comment
 * lines -> // <- to see the effect of each line of code.
 *
 * Some methods of this class have return values which can be printed from a main method. You must write the main
 * method to do this. Any methods that have return values are static and can be called as:
 * APFundamentals.method(args);
 *
 * @author Richard K. Hogans II - 2015
 */
public class APFundamentals {

    /*
       Private: Only this class has access to this variable / method / class.

       Protected: This class, this package, and all subclasses of this class have access to this variable / method / class.

       Public: All members of all classes in and out of this package have access to this variable / method / class.

       Privatization / Implementation Hiding is a practice that is performed to ensure that no matter what updates come to the code,
       anything that relies on the code of the private variable won't have to change. This is also used as a control to control what variables
       should be able to and shouldn't be able to be modified or accessed.

       For instance, if you only use a variable inside of a class, and no other classes have any use for it, you should declare
       it as private. This makes it easier for everyone, you, and the people that may use your code.

       NOTE: ALL CLASSES IN AP JAVA SUBSET ARE PUBLIC.
       */

    public double d = Double.MAX_VALUE;

    protected boolean b = true;

    private int i = Integer.MAX_VALUE;

    /**
     * Notice the difference between a JavaDoc and a multiline comment.
     * A javadoc is created like this one with two stars after the first forwardslash.
     * and one before the final forwardslash.
     */
    public APFundamentals() {
        /*
        * Multi-line or block comments look like this with one dot. You may have to know this
        * difference for AP.
        * */

        /*
            Block comments can also look like this.
         */
    }

    /**
        And javadocs can look like this!
        @return int some int.
     */
    public int operators() {
        /*
           All of the operators below may be tested on the AP exam.
           + addition
           - subtraction
           * multiplication
           / division
           % modulus - This returns the remainder of (a / b) when (a % b)
           */
        i = 1 + 1;
        //System.out.println(i);
        i = 1 - 1;
        //System.out.println(i);
        i = 2 * 2;
        //System.out.println(i);
        i = 2 / 2;
        //System.out.println(i);
        i = 10 % 3;
        //System.out.println(i);
        /*
           Increment and decrement operators are very useful, almost always in a loop of some sort,
           and there is a simple rule to remember where to put the ++ or --.

           When you are assigning an increment to a value:

           Variable at END, Assignment at END
           Variable at BEGIN, Assignment at BEGIN.
           */
        int x = 1, y;
        y = ++x; //x = 2, y = 2 //Add then assign value.
        //System.out.println(x + " x | y "  + y);
        y = x++; //x = 3, y = 2 //Assign value then add.
        //System.out.println(x + " x | y "  + y);

        y = x--; //x = 2, y = 3 //Assign value, then subtract.
        //System.out.println(x + " x | y "  + y);
        y = --x; //x = 1, y = 1 //Substract, then assign value.
        //System.out.println(x + " x | y "  + y);

        /*
           These mathematical assignment operators allow you to save some time writing.
           Where you would write y = y * i, you could simply write y *= i.

           y ?? i

           += add i to y then assign
           -= subtract i from y then assign
           *= multiply y by i then assign
           /= divide y by i then assign
           %= assign y to the remainder of y / i
           */
        y += i;
        //System.out.println(y);
        y -= i;
        //System.out.println(y);
        y *= i;
        //System.out.println(y);
        y /= i;
        //System.out.println(y);
        y %= i;
        //System.out.println(y);

        //Relationship Operators == >= <= != < > !
        //Short circuit / logical operators && and ||
        if(x == y || x <= y || x > y && x < y || x <= y || x != y) {
            b = true;
        }

        /*
          Note the difference between == and =. = ASSIGNS values to variables.
          == COMPARES two values for equality. This is not implementable with non-primitive
          types. For non-primitive types, you must use the .equals(Object o) operator.
          */

        return y;
    }

    public void numericalCasts() {
        int a = 1, b = 2, c = 3;
        double x_ = 0.5, y_ = 1.2, z_ = 1.3;

        double division;

        //Each of these will return a different value!

        /*
           IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

           When performing mathematical operations in Java, if you are not using a
           floating point (decimal) type to do operations, Java will round down (floor) if the
           operations does not already give a perfect integer answer.

           If you are using integers, shorts, or some other form of non-floating point
           number, and you want Java to give you a more precise, you will
           have to type cast to float or double. Java AP does not require you to use float
           types because most programs will use doubles for precise values.

           When doing these operations, you undergo a whole new order of operations.
           Not only do you have to worry about PEMDAS (and its highly reccomended you use
           parenthesis and separation to help Java solve long problems) but you also have
           to worry about when and what will be casted when you perform an operation.

           The first operation is simply:
           = a / c

           This means that Java will divide (int)a / (int)c which will round it to 0.0 because
           that's how Java handles integer mathematics!

           Now, the second operation is a mistake MANY programmers make, so don't be suprised
           when, in the future, you get weird data and can't find out why!

           It makes sense to say cast (double) to (a / c) but all this does is turn (a / c) into
           a double, and if (a / c) = 0.0, then (double)0.0 is still 0.0!

           Finally, the correct way to cast integers to get a precise value:

           Casting one of the integer values to a double will then change how JVM see's the
           math operation. It now sees it as (double)a / (int)c, and to keep a from being
           de-precision-ized, it will return the answer as a double. So it looks like this:

           = (double)1.0 / (int)3
           = (double)0.3333333333333333

           Knowing how to cast and when to cast is a very important skill that the AP test will
           probably try to trick you on.
           */
        division = a / c;
        //System.out.println(division);

        division = (double)(a / c);
        //System.out.println(division);

        division = (double)a / c;
        //System.out.println(division);

        /*
           When casting from a double to an int. Java is more strict. You must either cast every single double,
           or you can do the whole operation then cast at the end. The effect will be different.

           If you don't have everything casted to an int at the end, Java will let you know. You will be put in
           time out.

           = (int) (1.3 + 1.2);
           = (int) (2.5);
           = (int) (3)

           = (int) (1.3) + (int) (1.2);
           = (int) 1 + (int) 1
           = (int) (2)
           */
        int castedInt;

        castedInt = (int) (z_ + y_);
        //System.out.println(castedInt);
        castedInt = (int) z_ + (int) z_;
        //System.out.println(castedInt);
    }

    public void stringConcatenation() {
        /*
           String concatenation is another large part of Java. You will probably be concatenating strings quite often.
           For the sake of example, I have included a private enum of Ducks which will be used to show how to
           mix strings and objects and ints and what not.

           Note: In the real world, the StringBuffer class is a better way to do string concatenation
           but Java AP will not test you for it. If you want to know how to use StringBuffer, I will include
           an example here.

           Also Note: String manipulation, searching, sorting, and the lot are all very important knowledges to know,
           and there is a whole class on different string operations. This is most important when it comes to a lot of
           competitive programming, and general tasks you will be faced with.
           */

        //Random generator with a seed of the current processor time.
        Random random = new Random(System.currentTimeMillis());
        //Gets a random duck.
        DuckTypes duck = DuckTypes.values()[random.nextInt(DuckTypes.values().length)];


        for(int i = 1; i <= 10; i++) {
            if(i == 1) {
                String str = "I want " + i + " " + duck.toString() + ".";
            } else {

            }
        }
    }

    private enum DuckTypes {
        ABACOT("Abacot Ranger"), BOURBOURG("Bourbourg Duck"), CAYUGA("Cayuga Duck"), DENDERMOND("Dendermond Duck");

        private String name;

        private DuckTypes(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}




