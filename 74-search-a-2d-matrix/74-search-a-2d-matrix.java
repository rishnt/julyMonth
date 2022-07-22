class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = binarySearchRow(matrix,target);
        if(r==-1){
            return false;
        }
        
        boolean isFound = binarySearch(matrix,r,target);
        
        return isFound;
    }
    public static boolean binarySearch(int[][]matrix,int r,int target){
        int low=0;
        int high=matrix[0].length-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            if(matrix[r][mid]==target){
                return true;
            }
            else if(matrix[r][mid]<target){
                     low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        
    }
    
    public static int binarySearchRow(int[][]matrix,int target){
        
        int low=0;
        int high=matrix.length-1;
        int lc=matrix[0].length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(matrix[mid][0]<=target&&matrix[mid][lc]>=target){
                return mid;
            }
            else if(matrix[mid][0]<target){
                low=mid+1;
            }
            else if(matrix[mid][0]>target){
                high=mid-1;
            }
        }
        return -1;
    }
}