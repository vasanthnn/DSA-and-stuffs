package Assignments.Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * arr
 */
public class arr {

    public static void main(String[] args) {
        int n= 4;
        boolean [][] board =  new boolean[n][n];
        System.out.println(queen(board, 0));

    }

    private static ArrayList<String> queen(boolean[][] board, int row) {
        ArrayList<String> list = new ArrayList<>();
        if( row == board.length){
            for(boolean[] pos:board){
                for(boolean element:pos){
                    if(element){
                        ArrayList<String> list1 = new ArrayList<>();
                        
                        list.add("Q");
                    
                    }
                    else{
                       
                        list.add(".");
                    }
                }
                
                
                
            }
            
            
        }

        for (int col = 0; col < board.length; col++) {
            if(queensafe(board,row,col)){
                board[row][col]= true;
                list.addAll(queen(board, row+1));
                board[row][col]= false;
                
            }
        }
     
        return list;
        
        
    }

    private static boolean  queensafe(boolean[][] board,int row ,int col){
        // checking up
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }

        }
        // diagonal left
        int diagonalleft = Math.min(row,col);
        for (int i = 1; i <=diagonalleft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        // diagonal right
        int diagonalright = Math.min(row,board.length-col-1);
        for (int i = 1; i <=diagonalright; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    // private static ArrayList<String> display(boolean[][]board){
        // ArrayList<String> list = new ArrayList<>();
        // for(boolean[] row:board){
        //     for(boolean element:row){
        //         if(element){
        //             ArrayList<String> list1 = new ArrayList<>();
                    
        //             list.add(0,"Q");
                
        //         }
        //         else{
                   
        //             list.add(".");
        //         }
        //     }
            
            
            
        // }
        // return list;
        
    }
