class Solution {
    public int lengthOfLongestSubstring(String s) {


        String str="";
        HashSet<Character> set=new HashSet<>();

        int i=0;
        int j=0;
        int ans=0;

        while(j<s.length()){
        
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
          
           ans=Math.max(ans,j-i+1);
             j++;
        }
        return ans;
        
    }
}