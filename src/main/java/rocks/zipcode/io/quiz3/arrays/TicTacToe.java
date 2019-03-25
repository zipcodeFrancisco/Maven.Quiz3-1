package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;


    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] temp = {board[0][value],board[1][value],board[2][value]};
        return temp;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return isHomogeneous(getRow(rowIndex));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return isHomogeneous(getColumn(columnIndex));
    }

    public String getWinner() {
        Boolean result = false;
        String type = "";
        if ( isDiagonalFordwardHomogeneous() ){
            type = board[0][0];
        }
        else if( isDiagonalBackwardHomogeneous() ){
            type = board[0][2];
        }
        else {
            for (int i = 0; i < board.length; i++) {
                if ( isRowHomogenous(i) ){
                    type = board[i][0];
                }
                else if (isColumnHomogeneous(i)) {
                    type = board[0][i];
                }
            }
        }
        return type;
    }

    public Boolean isDiagonalFordwardHomogeneous(){
        return isHomogeneous( new String[]{board[0][0],board[1][1],board[2][2]} );
    }

    public Boolean isDiagonalBackwardHomogeneous() {
        return isHomogeneous( new String[]{board[0][2],board[1][1],board[2][0]} );
    }

    public Boolean isHomogeneous(String[] array){
        String previous = array[0];
        Boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != previous ){
                flag = false;
            }
        }
        return flag;
    }

    public String[][] getBoard() {
        return null;
    }
}
