class Solution {
    public int[] plusOne(int[] digits) {
       /* ArrayList<Integer> ar=new ArrayList<Integer>();
        String s="";
        for(int i=0;i<digits.length;i++){
                  s=s+digits[i];
        }
        long num=Long.parseLong(s);
        num=num+1;
        
        
        while(num!=0){
            int digit=(int)num%10;
            ar.add(digit);
            num=num/10;
        }
        
        Collections.reverse(ar);
        int[] a=new int[ar.size()];
        for(int i=0;i<ar.size();i++){
            a[i]=ar.get(i);
        }

        return a;*/
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
}
 digits =new int[digits.length+1];
        digits[0]=1;
        return digits;
          
    }
}


