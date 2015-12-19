package Questions.PracticePromptSolutions.SparseArrays;

/**
 * Created by hogansr on 12/2/2015.
 */
public class SparseArrayEntry {
    private int row;
    private int col;

    private int value;

    public SparseArrayEntry(int r, int c, int v) {
        row = r;
        col = c;
        value = v;
    }

    public int getValue() {

        return value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
