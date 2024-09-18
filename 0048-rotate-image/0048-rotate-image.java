class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] nums=new int[n][n];
        int m=n;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                nums[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=nums[n-1-j][i];
            }
        }
        
        
        
    }
}