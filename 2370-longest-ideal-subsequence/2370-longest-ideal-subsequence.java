class Solution {
     Integer[][] memo;
    public int longestIdealString(String s, int k) {

          memo=new Integer[s.length()][200];
        return findLongest(s,k,0,'*');
        
    }
    public int findLongest(String str,int k,int index,char prevchar ){
        if(index>=str.length()){
            return 0;
        }
        if(memo[index][prevchar]!=null){
            return memo[index][prevchar];
        }
        int take=0;
        if(Math.abs(prevchar-str.charAt(index))<=k || prevchar=='*'){
            take=1+findLongest(str,k,index+1,str.charAt(index));
        }

        int untake=findLongest(str,k,index+1,prevchar);
        return memo[index][prevchar]= Math.max(take,untake);
    }
}