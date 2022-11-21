class Solution {
    public boolean isPowerOfFour(int n) {
     int i=0;
        while(i<n){
            long pow=(long)Math.pow(4,i);
            if(pow==n){
                return true;
            }
            else if(pow>n){
                break;
            }
            i++;
        }
        return false;
        
    }
}