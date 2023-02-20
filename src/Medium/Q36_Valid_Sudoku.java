package Medium;

public class Q36_Valid_Sudoku {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board) {
        helper(board, 0, 0);
        return flag;
    }
    static boolean flag = true;
    public static void helper(char[][]board, int r, int c){
        if(c==board.length){
            r++;
            c = 0;
        }
        if(r==board.length){
            return;
        }
        if(board[r][c] != '.' && !check(board, r, c)){
            flag = false;
        }
        helper(board, r, c+1);
    }
    public static boolean check(char[][]board, int r, int c){
        for(int i = 0 ; i < board.length ; i++){
            if(i!=r){
                if(board[i][c] == board[r][c]){
                    return false;
                }
            }
        }
        for(int i = 0 ; i < board.length ; i++){
            if(i!=c){
                if(board[r][i] == board[r][c]){
                    return false;
                }
            }
        }
        int row = (r/3) * 3;
        int col = (c/3) * 3;
        for( int i = row; i < row + 3 ; i++){
            for( int j = col ; j < col + 3 ; j++){
                if(i!= r && j!=c){
                    if(board[i][j] == board[r][c]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
