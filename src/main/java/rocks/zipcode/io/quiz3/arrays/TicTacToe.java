package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    public TicTacToe(String[][] board) {
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return null;
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        for (int i = 0; i < 3 ; i++) {
            if(isRowHomogenous(i)) {
                return getRow(i)[0];
            }
            if(isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
        }
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
