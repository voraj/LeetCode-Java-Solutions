public class Solution {
    public int compareVersion(String version1, String version2) {
        
        int len= version1.length()>version2.length()? version1.length() :version2.length();
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
        int a=0; int b=0;
        int index=0;
        while(index<len){
            if(index>=v1.length)
                a=0;
            else
                a=Integer.parseInt(v1[index]);
            if (index>=v2.length)
                b=0;
            else
                b=Integer.parseInt(v2[index]);
            if(a>b)
                return 1;
            if(a<b)
                return -1;
                
            index++;
        }
        return 0;
        
    }
}