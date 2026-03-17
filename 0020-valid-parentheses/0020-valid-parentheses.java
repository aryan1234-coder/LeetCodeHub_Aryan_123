class Solution {
    public boolean isValid(String s) {

         if(s.length()%2==1){
        return false;
     }
 
 
      char[] charArray= s.toCharArray();
 
       Stack<Character> stk=new Stack<>();
 
 
    
      for(char c: charArray){
 
            if(c=='(' || c=='{'  || c=='['){
                stk.push(c);
 
            }

            else if(( !stk.isEmpty() && stk.peek()=='(' && c==')') || ( !stk.isEmpty() && stk.peek()=='{' && c=='}') || (!stk.isEmpty() && stk.peek()=='[' && c==']')) {

                 stk.pop();
            }
           else{
            return false;
           }
            
      }

      return stk.isEmpty() ? true: false;
 
       
    }
}
 