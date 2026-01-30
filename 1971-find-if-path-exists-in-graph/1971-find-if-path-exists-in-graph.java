class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {


        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());

        }

        for(int[] e: edges){
            ans.get(e[0]).add(e[1]);
            ans.get(e[1]).add(e[0]);
        }


        return bfs(source,destination,ans);
    }

    public boolean bfs(int source,int destination, List<List<Integer>> ans){


           boolean[] visited=new boolean[ans.size()];
           visited[source]=true;
            Queue<Integer> q=new LinkedList<>();
            q.add(source);

            while(!q.isEmpty()){

                int node=q.poll();

                if(node==destination){
                    return true;
                }

                for(int neighbour: ans.get(node)){
                     if(!visited[neighbour]){
                         visited[neighbour]=true;
                         q.add(neighbour);

                     }
                }
            }
            return false;


    }
}