class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ar=new int[2];
        ar[0]=firstOccurrence(nums,target);
        ar[1]=lastOccurrence(nums,target);
        return ar;
    }
    int firstOccurrence(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
         int mid=start+(end-start)/2;
            if(nums[mid]==target){
               ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
        }
          return ans;
      }
    int lastOccurrence(int[] nums,int target){
         int start=0;
        int end=nums.length-1;
        int answer=-1;
        while(start<=end){
             int mid=start+(end-start)/2;
            if(nums[mid]==target){
                answer=mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                   end=mid-1;
            }
            else if(nums[mid]<target){
                  start=mid+1;
            }
        }
        return answer;
    }
    
}