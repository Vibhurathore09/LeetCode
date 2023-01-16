class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char chess[][] = new char[n][n];
        Solve(list , 0 , chess);
        return list;
    }
    public static boolean safe( char [][] chess , int row , int col){
        
        for(int i = row-1 , j = col ; i>= 0 ;i--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1 , j = col-1 ; i>= 0 && j >= 0 ;j-- , i--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1 , j = col+1 ; i >= 0 && j < chess.length ; i-- , j++){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
     public static void safeBoard(char[][]board , List<List<String>> chess){
        String col = "";
        List<String> newboard = new ArrayList<String>();
        
        for(int i = 0 ; i < board.length ; i++){
            col = "";
            for(int j = 0 ; j < board.length ; j++){
                if(board[i][j] == 'Q'){
                    col+='Q';
                }else{
                    col+='.';
                }
            }
            newboard.add(col);
        }
        chess.add(newboard);
    }
    public static void Solve( List<List<String>> list , int row ,char[][] chess){
        if(row == chess.length){
            safeBoard( chess , list);
            return;
        }
        for(int i = 0 ; i < chess.length;i++){
            if(safe(chess , row , i)){
                chess[row][i] = 'Q';
                Solve(list , row+1, chess);
                chess[row][i] = '.';
            }
        }
    }
}