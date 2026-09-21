// 36. Valid Sudoku

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

import java.util.HashSet;

public class Leetcode_36 {
    

    
    public boolean isValidSudoku(char[][] board) {
        
        // rows

        for(int row = 0 ; row < 9 ; row++){
            HashSet<Character> set = new HashSet<>();

            for(int col = 0 ; col < 9 ; col++){
                char value = board[row][col];

                if(value == '.'){
                    continue;
                }

                if(set.contains(value)){
                    return false;
                }

                set.add(value);
            }
        }

        // column

        for(int col = 0 ; col < 9 ; col++){
            HashSet<Character> set =  new HashSet<>();
            for(int row = 0 ; row < 9 ; row++){
                char value = board[row][col];

                if(value == '.'){
                    continue;
                }

                if(set.contains(value)){
                    return false;
                }

                set.add(value);
            }
        }



        // For 3x3 box

        for(int boxRow = 0 ; boxRow < 9 ; boxRow += 3){
            for(int boxCol = 0 ; boxCol < 9 ; boxCol += 3){

                HashSet<Character> set = new HashSet<>();

                for(int row = boxRow ; row < boxRow + 3 ; row++){
                    for(int col = boxCol ; col < boxCol + 3 ; col++){
                        char value = board[row][col];

                        if(value == '.'){
                            continue;
                        }

                        if(set.contains(value)){
                            return false;
                        }

                        set.add(value);
                    }
                }
            }
        }
        
        return true;
    }
}
