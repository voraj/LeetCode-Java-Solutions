//38. Count and Say

public class Solution {
    public String countAndSay(int n) {
	sString no="1";
        int i=1;
        
        while(i<n){
            StringBuffer sb=new StringBuffer();
             int count=1;
            char refer=no.charAt(0);
             int index=1;
             
             while(index<no.length()){
            
                     if(no.charAt(index)==refer){
                        count++;
                      }
                 else
                 {
                sb.append(count);
                sb.append(refer);
                refer=no.charAt(index);
                count=1;
                }
            index++;
            }
        
        sb.append(count);
        sb.append(refer);
        no=sb.toString();
        i++;
        }
        return no;
    }
}