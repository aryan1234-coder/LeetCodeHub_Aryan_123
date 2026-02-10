class Solution {
    public int longestBalanced(int[] nums) {


       int answer=0;
       for(int i=0;i<nums.length;i++){
        HashSet<Integer> setOdd=new HashSet<>();
        HashSet<Integer> setEven=new HashSet<>();


        for(int j=i;j<nums.length;j++){


            if((nums[j] &1)==1){
                setOdd.add(nums[j]);
            }
            else{
                setEven.add(nums[j]);
            }


            if(setOdd.size()==setEven.size()){
                answer= Math.max(j-i+1,answer);
            }
        }

       }
       return answer;



        
    }
}