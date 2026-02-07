class Solution {
    public int minimumDeletions(String s) {


        int bCount=0;
        int deletion=0;

        for(int i=0;i<s.length();i++){


               char c=s.charAt(i);

               if(c=='b'){

                bCount++;

               }
               else{

                if(bCount>0){
                    deletion=Math.min(deletion+1,bCount);
                }
               }

        }

        return deletion;
        
    }
}