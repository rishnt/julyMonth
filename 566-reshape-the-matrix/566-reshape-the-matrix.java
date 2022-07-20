class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int[][] ar=new int[r][c];
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(col<c)
                {
               ar[row][col++]=mat[i][j];
                
                }
                else
                {
                    row++;
                    col=0;
                        j--;
                }
            }
        }                                                       
        return ar;
        
    }
}