class Solution {
    public String reverseWords(String s) {
         String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
                StringBuffer s1=new StringBuffer(a[i]);
            s1.reverse();
            a[i]=s1.toString();
        }
        
        String Str="";
        for(int i=0;i<a.length-1;i++){
            Str+=a[i]+" ";
        }
        Str+=a[a.length-1];
        
        return Str;
    }
}