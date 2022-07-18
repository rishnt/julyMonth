class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     
  ArrayList<Integer> a=new ArrayList<Integer>();
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        h.put(nums1[0],1);
        for(int i=1;i<nums1.length;i++){
            if(h.containsKey(nums1[i])){
                h.put(nums1[i],h.get(nums1[i])+1);
            }
            else{
                h.put(nums1[i],1);
            }
        }
        int k=0;
        for(int j=0;j<nums2.length;j++){
            if(h.containsKey(nums2[j])){
                if(h.get(nums2[j])>0){
                    a.add(nums2[j]);
                 h.put(nums2[j],h.get(nums2[j])-1);
                }
                else{
                    continue;
                }
            }
        }
        int[] ar=new int[a.size()];
        for(int i=0;i<a.size();i++){
            ar[i]=a.get(i);
        }
        
       return ar; 
    }
}