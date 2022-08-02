class Solution {
    public int reverse(int x) {
        long temp=x;
        long num=0;
        boolean flag=false;
        if(x<0){
            x=-x;
            flag =true;
        }
        while(x!=0){
            temp=x%10;
            num=num*10+temp;
            x=x/10;
        }
        if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE){
            return 0;
        }
        if(flag==true){
            return (int)-num;
        }
        return (int)num;
    }
}