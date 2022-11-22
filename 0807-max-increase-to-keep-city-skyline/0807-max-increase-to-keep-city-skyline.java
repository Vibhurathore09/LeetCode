class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid.length];
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j ++){
                row[i] = Math.max(grid[i][j] , row[i]);
                col[j] = Math.max(grid[i][j] , col[j]);
            } 
        }
        // for(int i : row){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int j : col){
        //     System.out.print(j+" ");
        // }
        int res = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j ++){
                res += Math.min(col[j], row[i]) - grid[i][j];
            }
        }
        return res;
    }
}