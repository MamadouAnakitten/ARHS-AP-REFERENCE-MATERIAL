package Questions.PracticePromptSolutions.Strings;

/**
 * Created by hogansr on 12/2/2015.
 */
public class HiddenWord {

    private String secretWord;
    private char[] secretWordChars;

    public HiddenWord(String secretWord) {
        this.secretWord = secretWord.toUpperCase();
        this.secretWordChars = secretWord.toCharArray();
    }

    /**
     * One possible solution to the getHint. There are most likely others! (That may be simpler, try to find them!)
     * @param guess String guess.
     * @return String that shows information about the guess.
     */
    public String getHint(String guess) {
        guess = guess.toUpperCase();

        char[] guessChars = guess.toCharArray();
        char[] returnChars = new char[secretWord.length()];

        for(int i = 0; i < returnChars.length; i++) {
            returnChars[i] = '*';
        }

        boolean containsLetter = false;

        for(int i = 0; i < guessChars.length; i++) {

            for(char c: secretWordChars) {
                if(c == guessChars[i]) containsLetter = true;
            }

            try {
                if(guessChars[i] == secretWordChars[i]){
                    returnChars[i] = secretWordChars[i];
                } else if(guessChars[i] != secretWordChars[i] && containsLetter) {
                    returnChars[i] = '+';
                } else {
                    returnChars[i] = '*';
                }
            } catch(ArrayIndexOutOfBoundsException ex) {
                break;
            }

            containsLetter = false;
        }
        return new String(returnChars);
    }

    public String getHiddenWord() {
        return secretWord;
    }
}
