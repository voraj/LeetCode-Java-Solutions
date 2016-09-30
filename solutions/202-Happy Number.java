public class Solution {
    
    public boolean isHappy(int n) {
        
        boolean exist[]=new boolean[1000];
        while(true){
            if(n==1)
                return true;
                int count=0;
             while(n!=0){
            count+= (n % 10) * (n % 10);
             n=n/10;
            }
            n=count;
            if(exist[count])
                return false;
            else
             exist[count]=true;
        }
       
        }
 
    }
