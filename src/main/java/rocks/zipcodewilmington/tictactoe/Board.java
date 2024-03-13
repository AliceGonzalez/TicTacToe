package rocks.zipcodewilmington.tictactoe;
//Character[][] matrix;
/*
  @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        //X Row Check
        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[i][0].equals('X') && matrix[i][1].equals('X') && matrix[i][2].equals('X'))) {
                return true;
            }
        }

        //X Columns Check
        for (int j = 0; j < matrix[0].length; j++) {
            if ((matrix[0][j].equals('X') && matrix[1][j].equals('X') && matrix[2][j].equals('X'))) {
                return true;
            }
        }

        if ((matrix[0][0].equals('X') && matrix[1][1].equals('X') && matrix[2][2].equals('X')) ||
                (matrix[2][0].equals('X') && matrix[1][1].equals('X') && matrix[0][2].equals('X'))) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO(){

        //X Row Check
        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[i][0].equals('O') && matrix[i][1].equals('O') && matrix[i][2].equals('O'))) {
                return true;
            }
        }

        //X Columns Check
        for (int j = 0; j < matrix[0].length; j++) {
            if ((matrix[0][j].equals('O') && matrix[1][j].equals('O') && matrix[2][j].equals('O'))) {
                return true;
            }
        }

        if ((matrix[0][0].equals('O') && matrix[1][1].equals('O') && matrix[2][2].equals('O')) ||
                (matrix[2][0].equals('O') && matrix[1][1].equals('O') && matrix[0][2].equals('O'))) {
            return true;
        }
        return false;
    }
    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX())
            return true;
        else
            return false;
    }
    public String getWinner() {
        if (isInFavorOfX()){
            return "X";
        }
        else if (isInFavorOfO()){
            return "O";
        }
        else {
            return "";
        }
    }

}

