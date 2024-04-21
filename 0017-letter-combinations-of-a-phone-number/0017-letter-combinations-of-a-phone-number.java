class Solution {

    List<String>  list=new ArrayList<>();

    public List<String> letterCombinations(String digits) {

         if(digits.length()==0){
            return new ArrayList<>();
         }
        HashMap<Character,String> map=new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        StringBuilder sb=new StringBuilder("");
        makeString(sb,map,digits);
        return list;




        
    }
    public void makeString(StringBuilder sb,Map<Character,String> map,String digits){
        if(digits.length()==0){
            list.add(sb.toString());
            return;
        }
        String str=map.get(digits.charAt(0));
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            makeString(sb,map,digits.substring(1));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}