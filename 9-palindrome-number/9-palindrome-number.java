class Solution {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
        }
        int num=0,rev;
        int temp=x;
       
        while(temp!=0){
            rev=temp%10;
            num=num*10+rev;
            temp=temp/10;
        }
        if(num==x){
            return true;
        }
        return false;
    }
}