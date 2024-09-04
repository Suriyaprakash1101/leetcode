class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
	    int k=matrix[n-1].length;
        int[][]a=new int[k][n];
        int col=0;
        for(int i=0;i<matrix.length;i++){
            
            
            for(int j=0;j<matrix[i].length;j++){
                a[j][i]=matrix[i][j];
                
                
            }
           
        }
        return a;
    }
}

