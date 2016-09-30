public class Solution {
    public int titleToNumber(String s) {
        char a[]=s.toCharArray();
        int sum=0;
        if(s.length()==1)
           return a[0]-65+1;
        else{
            
            int i=s.length()-1;
            int t=0;
            while(i>=0){
               char curr=s.charAt(t);  
               sum = sum + (int) Math.pow(26,i) * (curr-65+1) ;
               i--;
               t++;
            }
        }
        return sum;
    }
}