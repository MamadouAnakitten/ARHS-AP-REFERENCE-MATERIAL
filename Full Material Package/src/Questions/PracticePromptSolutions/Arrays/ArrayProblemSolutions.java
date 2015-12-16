package Questions.PracticePromptSolutions.Arrays;

/**
 * One potential solution. Implements enhanced loops where logical.
 */
public class ArrayProblemSolutions {

    /**
     * Returns the sum of all vaules in a one-dimensional integer array.
     * @param arr Array to be summated.
     * @return Sum of values in the array.
     */
    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Returns an array of sums for each row in a 2D integer array.
     * @param arr2D 2D array containing arrays of integers.
     * @return The sum of each row in a 2D integer array.
     */
    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for(int r = 0; r < arr2D.length; r++) sums[r] = arraySum(arr2D[r]);
        return sums;
    }


    /**
     * Returns true if the sums of each row in the 2D array are all different.
     * @param arr2D 2D Array of integers to be compared.
     * @return true if the values are all different.
     */
    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);

        for(int nextInt: sums) {
            for(int everyValue: sums) {
                if(nextInt == everyValue) return false;
            }
        }

        return true;
    }
}
