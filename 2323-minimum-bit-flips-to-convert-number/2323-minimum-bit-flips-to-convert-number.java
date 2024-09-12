class Solution {
    public int minBitFlips(int start, int goal) {

        String str=Integer.toBinaryString(start^goal);

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
        
    }
}