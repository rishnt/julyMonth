class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int l_sum=0;
        for(int i=0;i<n;i++){
            if(l_sum==sum-nums[i])
                return i;
                
            l_sum+=nums[i];
            sum-=nums[i];
        }
        return -1;
    }
}