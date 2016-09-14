//66. Plus One

public class Solution {
    public int[] plusOne(int[] digits) {
        
        int i=digits.length-1;
        digits[i]=digits[i]+1;
        while(i>0 && digits[i]==10){
            digits[i]=0;
            i--;
            digits[i]=digits[i]+1;
        }
         if(i==0 && digits[0]==10)
        {
            int []plus=new int[digits.length+1];
            plus[0]=1;
            for(int j=1;j<plus.length;j++)
                 plus[j]=0;
            return plus;
        }
        return digits;
    }
}