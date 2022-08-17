class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
       HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            h.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(h.contains(nums2[i])){
                ar.add(nums2[i]);
                h.remove(nums2[i]);
            }
            else{
                continue;
            }
        }
        int[] arr=new int[ar.size()];
        for(int i=0;i<ar.size();i++){
            arr[i]=ar.get(i);
        }
        return arr;
    }
}