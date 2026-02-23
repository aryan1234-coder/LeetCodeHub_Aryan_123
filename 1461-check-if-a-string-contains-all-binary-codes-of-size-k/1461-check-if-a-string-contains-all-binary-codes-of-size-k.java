class Solution {
    public boolean hasAllCodes(String s, int k) {

        HashSet<String> set=new HashSet<>();

        int total=1<<k;


        for(int i=k;i<=s.length();i++){

            String str=s.substring(i-k,i);
            if(!set.contains(str)){
                set.add(str);
            }
        }
        

        return total==set.size();
    }
}