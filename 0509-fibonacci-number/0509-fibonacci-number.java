class Solution {
    public int fib(int n) {
        int a=0,b=1,c=0;
        System.out.print(a+","+b+",");
        for(int i=0; i<n; i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        return a;
    }
}