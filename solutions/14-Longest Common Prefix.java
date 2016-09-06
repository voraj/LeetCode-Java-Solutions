//14. Longest Common Prefix

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return "";

        if(strs.length==1)
            return strs[0];
            
        int minLength=Integer.MAX_VALUE;   
        for(String s : strs){
             if(minLength > s.length())
                minLength=s.length();

        StringBuffer sb=new StringBuffer();
        
        for(int i = 0 ; i < minLength; i++){
            char c=strs[0].charAt(i);
            for(int j=1; j < strs.length; j++){
                if(strs[j].charAt(i)!=c)
                    return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();  
    }
}