//8. String to Integer (atoi)

public class Solution {
    public int myAtoi(String s) {
        
        if(s==null )
            return 0;
        s=s.trim();
        if(s.length()==0)
            return 0;
        boolean isNegative=false;
        boolean overflow=false;
        int no=0;
        int idx=0;
        if(s.charAt(0)=='-')
            {isNegative=true;
            idx++;}
        else if(s.charAt(0)=='+')
            idx++;
        for(int i=idx ; i < s.length(); i++){
            char c=s.charAt(i);
            if(!(c>='0' && c<='9') )
                break;
            int ch=c-'0';
            if(no>Integer.MAX_VALUE/10 || (no==Integer.MAX_VALUE/10 && Integer.MAX_VALUE%10 < ch) ){
                no=Integer.MAX_VALUE;
                overflow=true;
                break;
            }
            no=no*10+ch;    
        }   
        if(overflow && isNegative)
            no=Integer.MIN_VALUE;
        else if(!overflow && isNegative)
            no=-no;
        return no;
    }
}