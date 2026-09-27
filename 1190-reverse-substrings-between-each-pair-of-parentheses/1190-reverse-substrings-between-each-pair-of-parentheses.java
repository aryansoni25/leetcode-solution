class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> sb=new Stack<>();
        sb.push(new StringBuilder());
        for(char ch:s.toCharArray()){
            if(ch=='('){
                sb.push(new StringBuilder());
            }else if(ch==')'){
                StringBuilder temp=sb.pop();
                temp.reverse();
                sb.peek().append(temp);
            }else{
                sb.peek().append(ch);
            }
        }
        return sb.pop().toString();
    }
}