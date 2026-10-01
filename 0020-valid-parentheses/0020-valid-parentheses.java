class Solution {
    public boolean isValid(String st) {
        Stack<Character> s=new Stack<>();
        for(char ch:st.toCharArray()){
            if(ch=='(' ||ch=='{' ||ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty())
                    return false;
                
                char top=s.pop();
                if(ch=='}' && top!='{' ||ch==']' &&top!='[' ||ch==')' && top!='(')
                    return false;
            }
        }
        return s.isEmpty();
    }
}