class Solution {
    public boolean exist(char[][] board, String word) {
        
        //  String str="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(wordExist(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean wordExist(char[][] board ,String word,int i,int j,int index){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;

        }
        if(index==word.length()-1){

            return true;
        }
        char temp=board[i][j];
        board[i][j]='*';
        

        boolean ans=wordExist(board,word,i+1,j,index+1) || wordExist(board,word,i-1,j,index+1)
                    || wordExist(board,word,i,j+1,index+1) || wordExist(board,word,i,j-1,index+1);
        
        board[i][j]=temp;

        return ans;

    }
}