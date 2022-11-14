class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int mid=0;
        
        if(mat.length%2==1){
            mid=mat[mat.length/2][mat.length/2];
        }
        int size=mat.length-1;
            for(int i=0;i<mat.length;i++){
                sum+=mat[i][i]+mat[i][size--];
           
       }
        
        
        
        return sum-mid;
    }
}