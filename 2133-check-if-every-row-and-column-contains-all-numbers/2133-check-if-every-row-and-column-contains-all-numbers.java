class Solution {
    public boolean checkValid(int[][] matrix) {
     /*  HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=1;i<=matrix.length;i++){
               h.put(i,0);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                   h.put(matrix[i][j],h.get(matrix[i][j])+1);
             }
        }
        for(int i=1;i<=matrix.length;i++){
                  if(h.get(i)!=matrix.length){
                          return false;
                  }
        }
        return true;*/
        
        HashSet<Integer> h=new HashSet<Integer>();
        
         for(int i=0;i<matrix.length;i++){
            h.clear();
           for(int j=0;j<matrix[0].length;j++){
              h.add(matrix[j][i]);
           }
            
            if(h.size()!=matrix.length){
                return false;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            h.clear();
           for(int j=0;j<matrix[0].length;j++){
              h.add(matrix[i][j]);
           }
            
            if(h.size()!=matrix.length){
                return false;
            }
        }
        return true;
    }
}