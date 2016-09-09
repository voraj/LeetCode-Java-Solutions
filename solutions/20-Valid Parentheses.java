//20. Valid Parentheses

public class Solution {
    public boolean isValid(String st) {
        
        Stack<Character> s=new Stack<Character>();
        char temp;
        for(char i:st.toCharArray()){
            if (i=='{' || i=='(' || i=='[')
                s.push(i);
            else if(!s.isEmpty() && ((i=='}' && s.peek()=='{') || (i==')' && s.peek()=='(') || (i==']' && s.peek()=='[') ))
                temp=s.pop();
            else 
                return false;
              
        }
        if(s.isEmpty())
            return true;
        return false;
    }
}