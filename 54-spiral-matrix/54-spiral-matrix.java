class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> org=new ArrayList<Integer>();
        int start=0,right=matrix[0].length-1,low=0,bottom=matrix.length-1;
        
        while(start<=bottom&&low<=right){
            for(int i=low;i<=right;i++){
                org.add(matrix[start][i]);
            }
            start++;
            for(int i=start;i<=bottom;i++){
                org.add(matrix[i][right]);
            }
            right--;
            if(start<=bottom){
                for(int i=right;i>=low;i--){
                    org.add(matrix[bottom][i]);
                }
                bottom--;
                 }
              if(low<=right){
                  for(int i=bottom;i>=start;i--){
                      org.add(matrix[i][low]);
                  }
                  low++;
              }  
               }
        return org;
    }
}