class Solution {
    public List<String> letterCombinations(String digits) {


    

       String p="";
       HashMap<Character,String> map=new HashMap<>();
       List<String> ans= new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }
       map.put('2',"abc");
       map.put('3',"def");

        map.put('4',"ghi");
         map.put('5',"jkl");
          map.put('6',"mno");
           map.put('7',"pqrs");
            map.put('8',"tuv");
             map.put('9',"wxyz");

    
      
        
        combinations(p,digits,map,ans);
        return ans;
        
    }

    public static void combinations(String p, String digits, HashMap<Character,String> map, List<String> result){

        if(digits.length()==0){
            result .add(p);
            return;
        }
        char d=digits.charAt(0);

         if (!map.containsKey(d)) {
            combinations(p, digits.substring(1), map, result);
            return;
        }
        String letters=map.get(d);

        for(char c: letters.toCharArray()){

            combinations(p+c,digits.substring(1),map,result);

        }

                
    }
}