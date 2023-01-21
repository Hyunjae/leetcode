class Solution {
    public int climbStairs(int n) {
        
        int a = 3;
        int b = 2;
        
        if(n<4) a=n;
        
        for(int i=0; i<n-3; i++){
            a = a+b;
            b = a-b;
        }
        
        return a;
    }
}