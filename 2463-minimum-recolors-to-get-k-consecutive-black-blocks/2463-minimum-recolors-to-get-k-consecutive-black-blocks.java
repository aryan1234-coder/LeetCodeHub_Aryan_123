class Solution {
    public int minimumRecolors(String blocks, int k) {


        int i=0;
        int j=0;

        int min=Integer.MAX_VALUE;

        int count=0;

        while(j<blocks.length()){
           
           if(blocks.charAt(j)=='W'){
            count++;
           }

           if(j-i+1==k){
            min=Math.min(count,min);

            if(blocks.charAt(i)=='W'){
                count--;
            }
            i++;
           }
           j++;
        }
        return min;
          
        
    }
}