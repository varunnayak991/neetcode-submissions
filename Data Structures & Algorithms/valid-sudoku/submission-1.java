class Solution {
    public boolean isValidSudoku(char[][] board) {
    // Maps to store seen characters for each row, column, and 3x3 quadrant
    HashMap<Integer, HashSet<Character>> columnMap = new HashMap<>();
    HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
    HashMap<String, HashSet<Character>> quadrantMap = new HashMap<>();

    for(int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) { 
            char currentVal = board[i][j];
            
            if (currentVal == '.') continue; 

            HashSet<Character> rowSet = rowMap.computeIfAbsent(i, k -> new HashSet<>());
            if(rowSet.contains(currentVal))
                return false;
            rowSet.add(currentVal);

            HashSet<Character> columnSet = columnMap.computeIfAbsent(j, k -> new HashSet<>());
            if(columnSet.contains(currentVal))
                return false;
            columnSet.add(currentVal);

            String quadrantKey = Integer.toString(i / 3) + Integer.toString(j / 3);
            HashSet<Character> quadrantSet = quadrantMap.computeIfAbsent(quadrantKey, k -> new HashSet<>());
            if(quadrantSet.contains(currentVal))
                return false;
            quadrantSet.add(currentVal);
        }
    }
    return true;
    }
}
