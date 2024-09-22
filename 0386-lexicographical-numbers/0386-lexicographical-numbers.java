class Solution {
    public void solve(int i, int n,List<Integer> ans){

        if(i>n){
            return;
        }
        ans.add(i);
        for(int i1=0;i1<=9;i1++){
           int newnumber=i*10+i1;
           if(newnumber>n){
            return;

           }
           solve(newnumber,n,ans);
        }

    }
    public List<Integer> lexicalOrder(int n) {

        List<Integer> answer=new ArrayList<>();

        for(int i=1;i<=9;i++){
            solve(i,n,answer);
        }
        return answer;
        
    }
}