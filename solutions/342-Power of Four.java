public class Solution {
    public boolean isPowerOfFour(int n) {
        int num=n;
        if((n&n-1)!=0)
            return false;
            
        if((n&0x55555555)!=0)
             return true;
        return false;
    }
}