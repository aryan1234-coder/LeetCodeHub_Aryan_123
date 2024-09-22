class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<expression.length();i++){
            char operation=expression.charAt(i);
            if(operation=='-' || operation=='+' || operation=='*'){
                List<Integer> s1=diffWaysToCompute(expression.substring(0,i));
                List<Integer> s2=diffWaysToCompute(expression.substring(i+1));
                for(int a:s1){
                    for(int b:s2){
                        if(operation=='+'){
                            ans.add(a+b);
                        }
                        if(operation=='-'){
                            ans.add(a-b);
                        }
                        if(operation=='*'){
                            ans.add(a*b);
                        }
                    }
                }
            }
        }
         if (ans.isEmpty()) ans.add(Integer.parseInt(expression));
        return ans;

        
    }
}