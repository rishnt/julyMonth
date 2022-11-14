class Solution {
    public int largestAltitude(int[] gain) {
        int maxal=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
                maxal=Math.max(maxal,sum);
        }
        return maxal;
    }
}