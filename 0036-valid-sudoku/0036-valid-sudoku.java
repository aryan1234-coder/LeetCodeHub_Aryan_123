class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!iscorrectRow(board,i) || !iscorrectCol(board,i) || !iscorrectBox(board,i)){
                return false;
            }
        }
        return true;
    }
    public boolean iscorrectRow(char[][] board,int row){
       HashMap<Character,Integer> map=new HashMap<>();
       for(int j=0;j<9;j++){
           char currChar=board[row][j];
           if(currChar!='.'){
               map.put(currChar,map.getOrDefault(currChar,0)+1);
               if(map.get(currChar)>1){
                   return false;
               }
           }
       }
       return true;
    }
    public boolean iscorrectCol(char[][] board,int col){
         HashMap<Character,Integer> map=new HashMap<>();
       for(int j=0;j<9;j++){
           char currChar=board[j][col];
           if(currChar!='.'){
               map.put(currChar,map.getOrDefault(currChar,0)+1);
               if(map.get(currChar)>1){
                   return false;
               }
           }
       }
       return true;
    }
    public boolean iscorrectBox(char[][] board,int box){
        HashMap<Character,Integer> map=new HashMap<>();
        int startRow=3*(box/3);
        int startCol=3*(box%3);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char currChar=board[startRow+i][startCol+j];
                if(currChar!='.'){
                    map.put(currChar,map.getOrDefault(currChar,0)+1);
                    if(map.get(currChar)>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}