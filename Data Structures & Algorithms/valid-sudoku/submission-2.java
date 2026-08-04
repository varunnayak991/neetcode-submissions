class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet<>();
        
        
        for(int i=0; i< board.length; i++)
        {
            for(int j=0; j< board.length; j++) {

                if(board[i][j]== '.')
                {
                    continue;
                }
                
                if(seen.contains(board[i][j]+"r"+i) || seen.contains(board[i][j]+"c"+j))
                {
                    return  false;
                }
                
                seen.add(board[i][j]+"r"+i);
                seen.add(board[i][j]+"c"+j);

                if(seen.contains(board[i][j]+"s"+(i/3)+(j/3)))
                {
                    return  false;
                }

                seen.add(board[i][j]+"s"+(i/3)+(j/3));
            }
        }
        return true;
    
    }
}
