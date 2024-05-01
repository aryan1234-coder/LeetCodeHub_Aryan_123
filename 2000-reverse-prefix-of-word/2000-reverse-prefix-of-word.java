class Solution {
    public String reversePrefix(String word, char ch) {

   int index=word.indexOf(ch);

   if(index!=-1){
    return reverseString(word.substring(0,index+1))+word.substring(index+1);
   }
        return word;
        
        
        
    }
    public String reverseString(String str){
        String ans="";
        for(int j=str.length()-1;j>=0;j--){
            ans=ans+str.charAt(j);
        }
        return ans;
        
    }
}