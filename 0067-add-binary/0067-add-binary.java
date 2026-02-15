class Solution {
    public String addBinary(String a, String b) {
      StringBuilder ans=new StringBuilder();

      int i=a.length()-1;
      int j=b.length()-1;
      int carry=0;
      int sum=0;
      while(i>=0 || j>=0){
            sum=carry;
            if(i>=0){
                sum=sum+a.charAt(i--)-'0';
            }if(j>=0){
                sum=sum+b.charAt(j--)-'0';
            }
            carry=sum>1?1:0;
            ans.append(sum%2);
            

      }
      if(carry>0){
        ans.append(carry);
      }
      return ans.reverse().toString();
    }
}