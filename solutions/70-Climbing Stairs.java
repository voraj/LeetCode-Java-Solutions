//70. Climbing Stairs

public class Solution {
    public int climbStairs(int n) {
        
        int a[]=new int[n+1];
        a[0]=1;
        a[1]=1;
        if(n==0 || n==1)
            return a[n];
        for(int i=2;i<=n;i++){
            a[i]= a[i-1]+a[i-2];
        }
        return a[n];
    }
}