class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        int i=0;
        int j=1;
        int l=colors.length;

        int ans=0;

        while(j<colors.length+k-1){

            if(colors[j%l]==colors[(j-1)%l]){
                i=j;
            }
            if(j-i+1==k){
                i++;
                ans++;
            }

            j++;

        }
        return ans;

      


        
    }
}