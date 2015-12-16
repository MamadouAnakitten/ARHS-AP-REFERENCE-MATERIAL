import APStudyGuide.APArrays;
import APStudyGuide.APFundamentals;
import Questions.PracticePromptSolutions.Strings.HiddenWord;
import Swing.SwingLesson;

import java.util.Scanner;

/**
 * Feel free to call methods from each class instance here.
 */
public class Main {

    public static void main(String[] args) {
        APFundamentals fundamentals = new APFundamentals();
        APArrays arrays = new APArrays();
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
