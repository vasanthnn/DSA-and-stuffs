package Assignments.Leetcode;

// https://leetcode.com/problems/n-queens-ii/

public class NQueens {
    public static void main(String[] args) {

        int n = 4;
        boolean [][] board = new boolean[n][n];

         System.out.println(queens(board,0));
    }

    private static int queens(boolean[][] board,int row) {
        
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
            
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(issafe(board,col,row)){
                board[row][col]= true;
                count += queens (board, row+1);
                board[row][col]= false;
            }
        }
            return count;
    }

    private static boolean issafe(boolean[][] board, int col, int row) {
        
        // checking the row upwards
        for (int i = 0; i <row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // checking the diagonal left;

        int maxleft = Math.min(row,col);
        for (int i = 1; i <=maxleft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        // checking the diagonal right
        int maxRight = Math.min(row,board.length-col-1);

        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }

    private static void display(boolean[][] board) {
       for(boolean[] row: board){
        for(boolean element: row){
            if(element){
                System.out.print("Q");
            }
            else{
                System.out.print(".");
            }
        }
        System.out.println();
    }
    }


}
