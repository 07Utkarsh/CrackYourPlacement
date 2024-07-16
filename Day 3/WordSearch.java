class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        boolean result=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result=backtrack(board,i,j,visited,word,0);
                if(result){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean backtrack(char board[][], int i, int j, boolean visited[][], String word, int index){
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||word.charAt(index)!=board[i][j]||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(backtrack(board,i-1,j,visited,word,index+1)||
        backtrack(board,i,j-1,visited,word,index+1)||
        backtrack(board,i+1,j,visited,word,index+1)||
        backtrack(board,i,j+1,visited,word,index+1))
        {
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}