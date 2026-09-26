class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(List<String> pair:knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=s.indexOf(')',i);
                String key=s.substring(i+1,j);
                sb.append(map.getOrDefault(key,"?"));
                i=j+1;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}