class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr=new int[nums.length];
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<index.length;i++){
            if(h.contains(index[i])){
                //arr[index[i]]=nums[i];
                for(int j=nums.length-1;j>index[i];j--){
                              arr[j]=arr[j-1];
                }
                arr[index[i]]=nums[i];
            }
            else{
                if(arr[index[i]]!=0){
                     for(int j=nums.length-1;j>index[i];j--){
                              arr[j]=arr[j-1];
                }
                }
                arr[index[i]]=nums[i];
                h.add(index[i]);
            }
            
        }
        return arr;
    }
}