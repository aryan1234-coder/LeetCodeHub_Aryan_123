class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int count=0;
        int c1=0;
        for(char c:map.keySet()){
            if(map.get(c)%2==0){
                count=count+map.get(c);
            }
            else{
                c1++;
                count=count+map.get(c)-1;
            }
        }
        return c1>0?count+1:count;
    }
}