public class Solution {
    public String convertToTitle(int n) {
        
        StringBuffer sb=new StringBuffer();
        
        while(n>0){
            n--;
            char ch= (char) (n%26 + 'A');
            n=n/26;
           sb.insert(0,ch);
        }
        
        return sb.toString();
    }
}