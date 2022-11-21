class Solution {
    public boolean isPowerOfThree(int n) {
         int i=0;
        while(i<n){
            long pow=(long)Math.pow(3,i);
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