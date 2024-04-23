class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int i=0;
        int j=letters.length-1;
        char x1='0';

        while(i<=j){
            int mid=i+(j-i)/2;
            
          if(letters[mid]<=target){
                i=mid+1;
          }
          else{
            j=mid-1;
          }
        }
        if(i==letters.length){
            return letters[0];
        }
      
          return   letters[i];
       
    }
}