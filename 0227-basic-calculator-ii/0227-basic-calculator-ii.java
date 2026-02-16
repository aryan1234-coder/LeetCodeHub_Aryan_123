class Solution {
    public int calculate(String s) {

        Stack<Integer> stk=new Stack<>();
        int num=0;
        char operator='+';

        for(int i=0;i<s.length();i++){


            char c=s.charAt(i);

            if(Character.isDigit(c)){
                num=num*10 + c-'0';
            }

            if( isOperator(c) || i==s.length()-1){
                   

                   if(operator=='+'){
                    stk.push(num);
                   }
                    else if(operator=='-'){
                    stk.push(-num);
                   }
                    else if(operator=='*'){
                    stk.push(stk.pop()*num);
                   }
                    else if(operator=='/'){
                    stk.push(stk.pop()/num);
                   }

                   num=0;
                   operator = c;

            }


        }

        int ans=0;
        while(!stk.isEmpty()){
             ans=ans+stk.pop();
        }

        return ans;

        
    }
    private boolean isOperator(char c){
      return  c=='+' || c=='-' || c=='/' || c=='*';

        
    }
}