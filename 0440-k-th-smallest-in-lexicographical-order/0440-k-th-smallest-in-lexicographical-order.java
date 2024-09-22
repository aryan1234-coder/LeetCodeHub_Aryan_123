class Solution {
    public int countTotal(long curr,long next,int n){
        int c=0;

        while(curr<=n){
            c+=Math.min(next,(long) n+1)-curr;
            curr=curr*10;
            next=next*10;
        }
        return c;
    }
    public int findKthNumber(int n, int k) {

        int curr=1;
        k=k-1;

        while(k>0){
            int count=countTotal(curr,curr+1,n);
            if(count<=k){
                curr++;
                k=k-count;
            }
            else{
                curr=curr*10;
                k=k-1;
            }
        }
        return curr;
        
    }
}