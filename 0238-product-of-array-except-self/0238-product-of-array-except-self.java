class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightpro=new int[nums.length];
        rightpro[nums.length-1]=1;
      for(int i=nums.length-2;i>=0;i--){
             rightpro[i]=nums[i+1]*rightpro[i+1];
        }
        int prev=nums[0];
        nums[0]=1;
      for(int i=1;i<nums.length;i++){
          int temp=nums[i];
            nums[i]=prev*nums[i-1];
            prev=temp; 
      }  
    for(int i=0;i<nums.length;i++){
        rightpro[i]=rightpro[i]*nums[i];
            
        }
        return rightpro;
    }
}