import APStudyGuide.APArrays;
import APStudyGuide.APFundamentals;
import APStudyGuide.SubclassingRecursionAndClasses.Fraction;
import APStudyGuide.SubclassingRecursionAndClasses.MixedNumber;
import Questions.PracticePromptSolutions.Strings.HiddenWord;

import java.util.Scanner;

/**
 * Feel free to call methods from each class instance here.
 */
public class Main {

    /*
    * Make sure you open up each class to do the proper readings and implementation and experiments.
    *
    * I will post readings here sometime!
    * todo POST SURVEY - READING
    * */

    public static void main(String[] args) {
        APFundamentals fundamentals = new APFundamentals();
        APArrays arrays = new APArrays();

        Fraction fraction = new Fraction(357, 3);
        MixedNumber mixedNumber = fraction.toMixedNumber();
    }

    public void showHiddenWordGame() {
        HiddenWord hide = new HiddenWord("pasta fazool");

        String guess = "";
        Scanner scan = new Scanner(System.in);

        while(guess.equalsIgnoreCase(hide.getHiddenWord())){
            guess = scan.next();
            guess = hide.getHint(guess);
            //System.out.println(guess);
        }

    }
}
