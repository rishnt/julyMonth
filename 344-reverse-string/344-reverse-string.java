class Solution {
    public void reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
        
        while(low<high){
           char temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            low++;
            high--;
        }
        
        for(int i=0;i<s.length;i++){
                 System.out.print(s[i]);
        }
    }
}