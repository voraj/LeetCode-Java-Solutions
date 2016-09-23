public class Solution {
    public String reverseVowels(String s) {
        
        
        char ch[]=s.toCharArray();
        int i=0; int j=s.length()-1;
        
        while(i<j ){
            while( i<j&& !isVowel(ch[i]) ){
                i++;
            }
            while( i<j && !isVowel(ch[j]) ){
                j--;
            }
            
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            
        }
        
        return String.valueOf(ch);
    }
    
    private boolean isVowel(Character ch){
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':return true;
            default: return false;
        }
    }
}