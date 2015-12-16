package Questions.PracticePromptSolutions.SparseArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Saves more memory than a normal 2D array by only storing non-zero entries.
 * One possible solution.
 */
public class SparseArray
{
    /** The number of rows and columns in the sparse array. */
    private int numRows;
    private int numCols;

    private List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public void addEntry(SparseArrayEntry entry) {
        entries.add(entry);
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    /**
     * Returns the value at row = row, col = col. Return 0 if nothing is found or data = 0.
     * @param row Row that data lies.
     * @param col Column that data lies.
     * @return Data at that point.
     */
    public int getValueAt(int row, int col) {

        for(SparseArrayEntry entry: entries) {
            if(entry.getRow() == row && entry.getCol() == col) return entry.getValue();
        }

        return 0;
    }

    /**
     * Remove all data from a column.
     * @param col Column to format.
     */
    public void removeColumn(int col) {
        ListIterator it = entries.listIterator();

        SparseArrayEntry nextEntry;

        while(it.hasNext()){
            nextEntry = (SparseArrayEntry) it.next();
            if(nextEntry.getCol() == col) {
                it.remove();
            }
        }
    }
}