class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
        for(int i=0;i<nums.length;i++){
             int digits=0;
             int n=nums[i];
              while(n>0){
                  int temp=n%10;
                  digits++;
                  n=n/10;
              }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}