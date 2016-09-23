public class Solution {
    public boolean isPowerOfThree(int n) {
        
        double no= Math.log10(n)/Math.log10(3);
        if(no%1==0)
            return true;
        return false;
    }
}