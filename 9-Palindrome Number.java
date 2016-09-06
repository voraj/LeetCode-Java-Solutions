//9. Palindrome Number

public class Solution {
    public boolean isPalindrome(int x) {
                    qww     
            return false;
        int result=0;
        while(result<x){
            result=result*10+x%10;
            x=x/10;
        }
        
        if(x==result || result/10==x)
            return true;
        return false;
    }
}