class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<Integer>();
        h.add(nums[0]);
        for(int i=1;i<nums.length;i++){
             if(h.contains(nums[i])){
                 return true;
             }
            else{
                h.add(nums[i]);
            }
        }
        
        return false;
    }
}