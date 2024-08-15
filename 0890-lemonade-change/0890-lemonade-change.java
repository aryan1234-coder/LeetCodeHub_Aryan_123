class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> store = new HashMap<>();
        
        store.put(5,0);
        store.put(10,0);
        store.put(20,0);

        for (int i =0 ; i<bills.length;i++){

            if(bills[i] == 5 ) store.put(5,store.get(5)+1);

            if(bills[i] == 10 ){
                if(store.get(5) == 0 ) return false;
                store.put(5,store.get(5)-1);
                store.put(10,store.get(10)+1);
            }

            if(bills[i] == 20 ){

                if(store.get(5) == 0 && store.get(10) == 0 ) return false;
                
                if(store.get(5)>0 && store.get(10)>0){
                    store.put(5,store.get(5)-1);
                    store.put(10,store.get(10)-1);
                    store.put(20,store.get(20)+1);
                    continue;
                }

                if (store.get(10) == 0 && store.get(5) >= 3 ){
                        store.put(5,store.get(5)-3);
                        store.put(20,store.get(20)+1);
                        continue;
                }
                return false;
            }

        }
        return true;
    }
}