class Solution {
    public boolean checkStrings(String s1, String s2) {

        //even index of String s1 a, c,b

        //even index of Strinfg s2 c, b, a

        // odd index od String s1 b,d,a


        //odd index of a,d,b

        // now check for string s1 even s2 even like  s1 Even(a,c,b)  s2Even(c,b,c)  sort both of them get a,b,c this matches 
        // and s1 odd and s2 odd same for odd also if it matches 

        // we make sure that we can make that String s2


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