class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    setZeros(matrix , i , j);
                }
            }
        }
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == -9090){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public void setZeros(int [][] matrix , int i , int j){
        //Left
        for(int k = j ; k >= 0 ; k--){
            if(matrix[i][k] != 0){
                matrix[i][k] = -9090;
            }
        }
        //Right
        for(int k = j ; k < matrix[0].length ; k++){
            if(matrix[i][k] != 0){
                matrix[i][k] = -9090;
            }
        }
        //Up
        for(int k = i ; k >= 0 ; k--){
            if(matrix[k][j] != 0){
                matrix[k][j] = -9090;
            }
        }
        //Down
        for(int k = i ; k < matrix.length ; k++){
           if(matrix[k][j] != 0){
                matrix[k][j] = -9090;
            }
        }
    }
}