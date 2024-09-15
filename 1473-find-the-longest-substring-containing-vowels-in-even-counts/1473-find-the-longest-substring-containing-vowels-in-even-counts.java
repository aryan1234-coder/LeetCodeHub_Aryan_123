class Solution {
    public int findTheLongestSubstring(String s) {

        HashMap<String,Integer> map=new HashMap<>();
        int[] vowelCount=new int[5];
        String currState="00000";
        map.put(currState,-1);
        int maxAns=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                vowelCount[0]=(vowelCount[0]+1)%2;

            }
            if(s.charAt(i)=='e'){
                vowelCount[1]=(vowelCount[1]+1)%2;
                
            }
            if(s.charAt(i)=='i'){
                vowelCount[2]=(vowelCount[2]+1)%2;
                
            }
            if(s.charAt(i)=='o'){
                vowelCount[3]=(vowelCount[3]+1)%2;
                
            }
            if(s.charAt(i)=='u'){
                vowelCount[4]=(vowelCount[4]+1)%2;
                
            }
            currState="";
            for(int j=0;j<5;j++){
                currState+=vowelCount[j];
            }

            if(map.containsKey(currState)){
               maxAns=Math.max(maxAns,i-map.get(currState));

            }
            else{
                map.put(currState,i);
            }


        }
        return maxAns;
    }
}