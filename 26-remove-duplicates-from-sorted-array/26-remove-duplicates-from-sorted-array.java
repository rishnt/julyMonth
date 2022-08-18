class Solution {
    public int removeDuplicates(int[] nums) {
    int num=1;
        for(int i=1;i<nums.length;i++){
            if(nums[num-1]!=nums[i]){
                nums[num]=nums[i];
                num++;
            }
        }
        return num;
    }
}