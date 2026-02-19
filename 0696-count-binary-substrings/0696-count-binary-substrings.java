class Solution {
    public int countBinarySubstrings(String s) {

      int prevGroup = 0;
        int currGroup = 1;
        int result = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {
                
                prevGroup = currGroup;
                currGroup = 1;
            }

            if (currGroup <= prevGroup){
        result++;
            }
        }

        // Add last group comparison
        

        return result;
        
    }
}