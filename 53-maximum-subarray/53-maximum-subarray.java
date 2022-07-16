class Solution {
    public int maxSubArray(int[] nums) {
        //Kadanes algorithm
        
        int sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
sum=0;
            }
        }
        return max_sum;
        
    }
}