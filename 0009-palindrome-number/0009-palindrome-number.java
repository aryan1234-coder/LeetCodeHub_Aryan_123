class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //int c=0;
        int y=x;
        int sum=0;
        while(y!=0){
           sum=y%10+sum*10;
            
            
            y=y/10;
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}