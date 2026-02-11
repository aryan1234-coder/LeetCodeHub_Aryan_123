class Solution {

    public String minWindow(String s, String t) {

        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character, Integer> need=new HashMap<>();
        for(char c: t.toCharArray()){
             need.put(c, need.getOrDefault(c,0)+1);
        }
        int required=need.size();
        int formed=0;

        HashMap<Character, Integer> window= new HashMap<>();
        int left=0;
        int right=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;

        while(right<s.length()){
            char c1=s.charAt(right);
            window.put(c1,window.getOrDefault(c1,0)+1);

            if(need.containsKey(c1) && window.get(c1).intValue()==need.get(c1).intValue()){
                formed++;
            }

            while(left<=right && formed==required){

                if(right-left+1< minLen){
                    minLen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                window.put(leftchar, window.get(leftchar)-1);

                if(need.containsKey(leftchar) && window.get(leftchar)< need.get(leftchar)){
                    formed--;
                }
                left++;
            }
            right++;
        }

       return minLen == Integer.MAX_VALUE ? "" 
                                           : s.substring(start, start + minLen);

        
    }
}