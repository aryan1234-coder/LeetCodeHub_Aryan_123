class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> stk=new Stack<>();

        char[] charArray=s.toCharArray();

        for(char c: charArray){

            if(!stk.isEmpty() && stk.peek()[0]==c){

                stk.peek()[1]++;

                if(stk.peek()[1]==k){
                    stk.pop();
                }
                

            }
            else{
                    stk.push(new int[]{c,1});
                }


        }
            StringBuilder sb = new StringBuilder();
    for (int[] item : stk)
        for (int i = 0; i < item[1]; i++) sb.append((char) item[0]);
    return sb.toString();

        
    }
}