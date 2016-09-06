//6-ZigZag Conversion

public class Solution {
    public String convert(String s, int numRows) {
        
        StringBuffer sb[]=new StringBuffer[numRows];
        
        for(int i=0; i<numRows; i++){
            sb[i]=new StringBuffer();
        }
        
       int i=0;
       int len=s.length();
       while(i < len) {
           
           for(int j = 0; j < numRows && i < len ; j++){
               
               sb[j].append(s.charAt(i));
               i++;
           }
           
           for(int j = numRows-2; j >= 1 && i < len ; j--){
               
               sb[j].append(s.charAt(i));
               i++;
           }
       }
       
       StringBuffer sbuf=new StringBuffer();
       
       for(int idx=0; idx < numRows; idx++){
            sbuf.append(sb[idx]);
        }
        return sbuf.toString();
    }
}