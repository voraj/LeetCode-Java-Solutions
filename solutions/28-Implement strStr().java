//28. Implement strStr()

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null)
            return 0;
        if(needle.length() == 0)
            return 0;
        
        char h[] = haystack.toCharArray();
        char n[] = needle.toCharArray();
       
       for(int i=0;i<h.length;i++) {
            if(i+n.length>h.length)
                return -1;
            if(checkStr(i, h, n)){
                     return i;
           }
       }
       
       return -1;
    }
    
    public boolean checkStr(int index, char[] h, char[] n){
 
        for(int i = 0; i<n.length; i++) {
            if(h[index+i] != n[i])
                return false;
        }
        return true;
    }
}