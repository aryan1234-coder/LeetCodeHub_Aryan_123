class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {


        int r=image.length;
        int c=image[0].length;

        int original=image[sr][sc];

        if(original==color){
            return image;
        }
        dfs(image,sr,sc,original,color);

        return image;
        // Queue<int[]> queue=new LinkedList<>();
        
        // queue.offer(new int[]{sr,sc});
        // image[sr][sc]=color;

        // int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};

        // while(!queue.isEmpty()){

        //     int[] cell=queue.poll();
        //     for(int[] d: directions){

        //         int x1= d[0]+cell[0];
        //         int y1= d[1]+cell[1];

        //         if(x1>=0 && y1>=0 && x1<r && y1<c && image[x1][y1]==original){
        //             image[x1][y1]=color;
        //             queue.offer(new int[] {x1,y1});
        //         }
        //     }
        // }
        // return image;
        




        
    }
    public void dfs(int[][] image, int sr,int sc,int original,int color){

        int r=image.length;
        int c=image[0].length;

         int[][] directions= {{0,1},{0,-1},{1,0},{-1,0}};
        image[sr][sc]=color;


        for(int[] dir: directions){
            int x1=dir[0]+sr;
            int y1=dir[1]+sc;

            if(x1>=0 && y1>=0 && x1<r && y1<c && image[x1][y1]==original && image[x1][y1]!=color){
                 
                 image[x1][y1]=color;
                 dfs(image,x1,y1,original,color);
            }
        }



    }
}