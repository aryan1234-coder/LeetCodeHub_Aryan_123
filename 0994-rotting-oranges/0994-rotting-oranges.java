class Solution {
    public int orangesRotting(int[][] grid) {


         Queue<int[]> queue=new LinkedList<>();
        int freasheoranges=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){ 
                       queue.add(new int[] {i,j});
                }
                if(grid[i][j]==1){
                   freasheoranges++;
                }

            }
        }  
         int[][] direction={ {1,0}, {-1,0}, {0,1}, {0,-1}};
        if(freasheoranges==0){
            return 0;
        }
       int minutes=0;

        while(!queue.isEmpty()){
            boolean rotted=false;
            int length=queue.size();
            for(int i=0;i<length;i++){
                int[] current=queue.poll();
                for(int[] dir: direction){

                    int d1= current[0] + dir[0];
                    int d2= current[1] + dir[1];

                    if(d1>=0 && d1<r && d2>=0 && d2<c && grid[d1][d2]==1){
                        grid[d1][d2]=2;
                        queue.offer(new int[]{d1,d2});
                        freasheoranges--;
                        rotted=true;
                    }
                }
            }
            if(rotted){
                minutes++;
            }

        }



         if(freasheoranges==0){
           return minutes;
         }
         else{
               return -1;
         }


        
    }
}