class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        String[] str1=sentence1.split(" ");
        String[] str2=sentence2.split(" ");

        if(str1.length<str2.length){
            String[] temp=str1;
            str1=str2;
            str2=temp;
        }
        int i1=0;
        int i2=0;
        int n1=str1.length;
        int n2=str2.length;

        while(i1<n2 && str1[i1].equals(str2[i1])){
            i1++;
        }

        while(i2<n2 && str1[n1-i2-1].equals(str2[n2-i2-1])){
            i2++;
        }

        return i1+i2>=n2;

    }
}