package Assignments.Leetcode;

public class sudoku {
    public static void main(String[] args) {
        int [][] board ={
         {3,7,8,0,0,5,9,0,0},
         {4,2,9,0,6,0,1,8,0},
         {5,6,1,0,0,8,0,7,4},
         {6,1,3,0,4,9,8,0,0},
         {2,5,7,0,0,0,6,0,9},
         {9,8,4,0,0,2,0,0,1},
         {1,0,6,0,8,0,7,5,0},
         {7,4,0,0,0,0,0,1,0},
         {0,0,0,0,0,7,4,9,6}};
            
         if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
        }
        

        
    

    static boolean solve(int[][]board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyleft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }

            }

            if(emptyleft == false){
                break;
            }
        }
        if(emptyleft){
            return true;
        }

        // backtrack
        for (int number = 1; number <=9; number++) {

            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    
                    return true;
                }
                else{
                    board[row][col]=0;
                }
            }



        }
        return false;
    }

    private static void display(int[][] board) {
       
        for (int []row: board) {
            for (int num:row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][]board,int row ,int col,int num){
        // check the row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==num){
                return false;
            }
        }

        // check the column
        for (int[] nums: board) {
            if(nums[col] == num){
                return false;
            }
        }

        // check the square  matrix

        int sqrt = (int)Math.sqrt(board.length);
        int rowstart = row - row % sqrt;
        int colstart = col - col %  sqrt;

        for (int r = rowstart; r < rowstart + sqrt; r++) {
            for (int c = colstart; c < colstart + sqrt ; c++) {
                if(board[r][c]== num){
                    return false;
                }
            }
        }
        return true;
    }
}
