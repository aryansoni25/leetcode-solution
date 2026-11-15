class Solution {
    public int longestPalindrome(String s) {
       HashSet<Character> set=new HashSet<>();
       int length=0;
       for(char ch:s.toCharArray()){
        if(set.contains(ch)){
            length+=2;
            set.remove(ch);
        }else{
            set.add(ch);
        }
       } 
       if(!set.isEmpty())
       length++;
       return length;
    }
}