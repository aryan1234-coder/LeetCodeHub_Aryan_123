class Solution {
    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
       
        int sum1=skill[i]+skill[j];
        long ans=0;
        while(i<skill.length/2)
        {
            if(sum1!=skill[i]+skill[skill.length-i-1]){

             return -1;
            }
           ans+=(long)(skill[i]*skill[skill.length-i-1]);
           i++;
              
        }
        return ans;
        
    }
}