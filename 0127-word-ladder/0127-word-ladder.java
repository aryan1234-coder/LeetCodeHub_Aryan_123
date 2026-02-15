class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


       Set<String> set=new HashSet<>(wordList);

       if(!set.contains(endWord)){
        return 0;
       }

       Queue<String> q=new LinkedList<>();

       q.add(beginWord);
        int level=1;
     while(!q.isEmpty()){

        int size=q.size();

        for(int i=0;i<size;i++){

            String word=q.poll();
            char[] charArray=word.toCharArray();

            for(int j=0;j<charArray.length;j++){
                char ch=charArray[j];

                for(char c='a'; c<='z' ; c++ ){
                   charArray[j]=c; 
                   String newWord=new String(charArray);

                   if(newWord.equals(endWord)){
                    return level+1;
                   }

                   if(set.contains(newWord)){
                          q.add(newWord);
                          set.remove(newWord);
                   }


                }
                charArray[j]=ch;

            }

         


        }
       level++;
     }
      return 0;


    }
}