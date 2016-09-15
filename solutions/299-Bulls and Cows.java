public class Solution {
    public String getHint(String secret, String guess) {
        
       int hash[]=new int[10];
       int bull=0;
       for(int i=0;i<secret.length();i++){
           int secretVal=secret.charAt(i)-'0';
           int guessVal=guess.charAt(i)-'0';
           if(secretVal==guessVal)
                bull++;
            hash[secretVal]++;
            hash[guessVal]--;
       }
       int sum=0;
       for(int i=0;i<10;i++){
           sum=sum+Math.abs(hash[i]);
       }
       sum=sum/2;
       int cow=secret.length()-bull-sum;
       
         return bull+"A"+cow+"B";
    }
}