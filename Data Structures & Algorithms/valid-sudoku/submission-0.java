class Solution {
    public boolean isValidSudoku(char[][] board) {

        //check rows
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }

        //check columns
        for (int j = 0; j < board.length; j++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < board.length; i++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                } else {
                    set.add(board[i][j]);
                }

            }
        }
        
        
//BOX CHECKING
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') {
                            continue;
                        }

                        if (set.contains(board[i][j])) {
                            return false;
                        }

                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;

    }}