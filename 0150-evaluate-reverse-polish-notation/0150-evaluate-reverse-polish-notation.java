class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk=new Stack<>();
      

        for(int i=0;i<tokens.length;i++){

            if(tokens[i].equals("+") ){
                stk.push(stk.pop()+stk.pop());
            }
            else if(tokens[i].equals("-")){

                int n1=stk.pop();
                int n2=stk.pop();
                stk.push(n2-n1);

            }
            else if(tokens[i].equals("*")){
                stk.push(stk.pop()*stk.pop());

            }
            else if(tokens[i].equals("/")){

                int n3=stk.pop();
                int n4=stk.pop();
                stk.push(n4/n3);

            }

            else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }

        return stk.peek();
        
    }
}