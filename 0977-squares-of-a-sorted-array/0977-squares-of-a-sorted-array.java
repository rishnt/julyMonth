class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int s=0;
        int e=nums.length-1;
        for(int p=nums.length-1;p>=0;p--){
            if(Math.abs(nums[s])>Math.abs(nums[e])){
                res[p]=nums[s]*nums[s];
                s++;
            }
            else{
                res[p]=nums[e]*nums[e];
                e--;
            }
        }     
        return res;
    }
}