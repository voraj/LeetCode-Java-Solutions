public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String arr[]=str.split(" ");
        if(pattern.length()!=arr.length)
            return false;
        HashMap<String,Character> map=new HashMap<String,Character>();
        for (int i=0;i< arr.length;i++){
            char c=pattern.charAt(i);
            if(map.containsKey(arr[i])){
                char ch=map.get(arr[i]);
                if(ch!=c)
                    return false;
            }
            else
                {
                    if(map.containsValue(c))
                        return false;
                    map.put(arr[i],c);
                }
        }
        return true;
    }
}