class Solution {
    public boolean canBeEqual(String s1, String s2) {

          StringBuilder stringOneEven=new StringBuilder();
        StringBuilder stringOneOdd=new StringBuilder();
        StringBuilder stringTwoEven=new StringBuilder();
        StringBuilder stringTwoOdd=new StringBuilder();

        for(int i=0;i<s1.length();i++){

            if(i%2==0){
                 stringOneEven.append(s1.charAt(i));
                 stringTwoEven.append(s2.charAt(i));
            }
            else{
                 stringOneOdd.append(s1.charAt(i));
                 stringTwoOdd.append(s2.charAt(i));
            }
        }

        char[] c1=stringOneEven.toString().toCharArray();
         char[] c2=stringOneOdd.toString().toCharArray();
          char[] c3=stringTwoEven.toString().toCharArray(); 
          char[] c4=stringTwoOdd.toString().toCharArray();



         Arrays.sort(c1);
         Arrays.sort(c2);
         Arrays.sort(c3);
         Arrays.sort(c4);


         return Arrays.equals(c1,c3)  && Arrays.equals(c2,c4);
        
    }
}