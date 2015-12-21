package APStudyGuide;

import java.util.Random;

/**
 * Because arrays are such an extensive information bank, I have to separate it from the rest of the fundemental
 * knowledge that may be on the 2015 AP Test. Arrays and ArrayLists are the most commonly data structures that
 * Java programmers use.
 *
 * Arrays associate an Object with an index value, that can be searched, organized, and stored.
 */
public class APArrays {

    private int[] data;
    private Cheese[] cheeses;

    public void arrayTraversal() {
        /*
           Array traversing is something that everyone does. You have done it, I have done it, and there are many
           ways TO do it. Here are some ways you can traverse an array.

           The first way you can traverse an array is with a good old for-each loop. Since array's are really just
           collections of objects, you can easily search for objects, or information like quantities like this...
           */

        //Find all the even numbers in the data.
        int evens = 0;
        for(int i: data) {
            if(i % 2 == 0) evens++;
        }
        //System.out.println(evens);

        /*
           Another way that you can search an array is by index. Say you wanted to change every other value in an array
           to zero, like if the data array was a lottery and you wanted 50/50 odds of getting a 0, you could do it like
           this:
           */
        //For every other value in data, assign 0.
        for(int i = 0; i < data.length; i += 2) {
            data[i] = 0;
        }

        /*
           You should also note that arrays, when passed as arguments, pass the actual reference to the array, so all of
           the information in that array can be accessed, and modified. If you wanted to actually pass a copy, you would
           have to make a deep copy. Which copies all data from the array to another new array.

           You can easily make a copy of an array by doing (arr.clone());
           */
        Cheese[] cheeseClone = cheeses.clone();
        int[] dataClone = data.clone();

        cleanArray(cheeseClone);
        cleanArray(dataClone);

        //System.out.println(cheeses);
        //System.out.println(cheeseClone);
        //System.out.println(data);
        //System.out.println(dataClone);
    }

    public void twoDimensionalArrays() {
        /*
          Two dimensional arrays will definitely be tested in the AP Java subset and you should
          most certainly know how to use them, and how to operate them. There is some moodle reading on
          multi-dimensional arrays, but here I will try to condense the information and show throughout examples
          of multi-dimensional arrays.

          Two dimensional arrays have varying usages and when you will need them will vary, but when you /could/ use
          them may suprise you in frequency. They are most helpful in solving matrices (if you have done pre-calculus or
          calculus and understand why you would need a matrix) and organizing graphical problems and information.

          Two dimensional arrays look like this:
          */

        int[][] greyscaleValues ={{234, 14, 64, 117, 82},
                                  {23, 35, 15, 153, 34},
                                  {342, 53, 14, 53, 142},
                                  {223, 232, 42, 54, 124},
                                  {43, 15, 164, 122, 31}};
        /*
          The values above could serve the purpose of the variable name. They could represent a greyscale value to
          paint some pixels! We could rename the array and it would show a whole new purpose.
          */

        int[][] weeklySales ={{234, 14, 64, 117, 82},
                {23, 35, 15, 153, 34},
                {342, 53, 14, 53, 142},
                {223, 232, 42, 54, 124},
                {43, 15, 164, 122, 31}};

        /*
          Now the array represents the amount of sales from Monday to Friday for five weeks. A VERY IMPORTANT aspect of
          two-dimensional arrays that is crucial to know is that 2-D arrays, that is very obvious, but easy to forget,
          is that they are an array of arrays! So you can split this into five arrays and perform other array operations
          on them. They can also be called into a loop like so:

          (Erase the comment bellow to see output!)
          */
        int totalSalesForTheWeek = 0;
        int counter = 1;

        for(int[] dailySales: weeklySales) {
            for(int i: dailySales) {
                totalSalesForTheWeek += i;
            }
            //System.out.println("Daily sales for week " + counter + " totaled " + totalSalesForTheWeek + " sales!");
            counter++;
            totalSalesForTheWeek = 0;
        }

        /*
          You can see now that two-dimensional arrays could be quite useful! Three-dimensional arrays would be the
          logical next step in array knowledge, but it begins to become pretty intense to think about! But they, also,
          serve a purpose, but luckily you will not be tested on them, and will probably rarely, if ever, use one unless
          you are doing some serious mathematic / graphical data processing.

          One last thing is that, you can access two-dimensional arrays in two ways, you can use the "enhanced loop"
          above (that is what it is called), or you can use a traditional counter loop like below:
          */
        totalSalesForTheWeek = 0;

        for(int week = 0; week < weeklySales.length /* Note that this returns how many arrays there are! */; week++) {
            int [] dailySales = weeklySales[week];
            for(int i: dailySales) {
                totalSalesForTheWeek += i;
            }
            //System.out.println("Daily sales for week " + week + " totaled " + totalSalesForTheWeek + " sales!");
            totalSalesForTheWeek = 0;
        }

        /*
          Both methods will return the same number and were completed in roughly the same amount of code. The latter,
          does; however, require less code since it does not need to use the counter.
          */
    }

    private static int[] cleanArray(int[] arr) {
        return new int[arr.length];
    }

    private static Cheese[] cleanArray(Cheese[] arr) {
        return new Cheese[arr.length];
    }

    private void fillArraysWithRandomNonsenseData() {
        Random random = new Random(System.currentTimeMillis());

        int sizeData = random.nextInt(234);
                data = new int[sizeData];

        for(int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(sizeData);
        }

        String[] cheeseNames = {"Maffra Red Leicester", "Martha's Heat", "Wild Garlic Rebel", "L'Amuse Brabander Goat Gouda", "Dante", "Gammelost", "Adelost"};
                     cheeses = new Cheese[cheeseNames.length];

        int counter = 0;
        for(String str: cheeseNames){
            cheeses[counter] = new Cheese(str, random.nextInt(sizeData));
            counter++;
        }
    }
}

/**
 * This is not required to know, but see how I have made another class inside of another class's classfile?
 * This is useful for organization, or if you have a bunch of Static methods you want to separate from the main
 * class. For my sake, I really only want this here so I don't have to make another file, since I will only be using
 * this class within the APArrays.java file, and nowhere else.
 * **/
class Cheese {
    //Final indicates that these values may NEVER be changed.
    public final String name;
    public final int ID;

    public Cheese(String name, int identifier) {
        this.name = name;

        ID = identifier;
    }
}
