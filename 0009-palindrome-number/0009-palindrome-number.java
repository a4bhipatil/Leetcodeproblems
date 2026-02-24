class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int m=x;
        int result=0;
        while(x!=0){
            int r=x%10;
            result=result*10+r;
            x=x/10;
        }
        return result==m;
    }
}