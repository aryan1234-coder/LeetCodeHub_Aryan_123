class Solution {
    public int findCircleNum(int[][] isConnected) {


        int n=isConnected.length;

        boolean[] visited=new boolean[n];

        int ans=0;

        for(int i=0;i<n;i++){

            if(!visited[i]){
                 ans=ans+1;
                 dfs(i,isConnected,visited);
            }
        }
        return ans;
  
    }

    public void dfs(int city,int[][] connected, boolean[] visited){
           
           visited[city]=true;

           for(int i=0;i<connected.length;i++){

            if(connected[city][i]==1 && !visited[i]){
                dfs(i,connected,visited);

            }
           }

    }
}