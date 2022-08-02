class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
         int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=i;
             sum1+=nums[i];
        }
       sum+=nums.length;
        return sum-sum1;
    }
}