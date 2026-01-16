// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans =new ArrayList<>();
//         ans.add(new ArrayList<>());


//            for(int num: nums){
//             List<List<Integer>> newList =new ArrayList<>();
//         for(List<Integer> perm: ans){

//             for(int i=0;i<=perm.size();i++){
//                  List<Integer> newperm =new ArrayList<Integer>();
//                  newperm.add(i,num);
//                  newList.add(newperm);

                
//             }

//         }
//         ans=newList;
//            }

// return ans;
        
//     }
// }
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> newList = new ArrayList<>();

            for (List<Integer> perm : ans) {
                for (int i = 0; i <= perm.size(); i++) {
                    List<Integer> newperm = new ArrayList<>(perm); 
                    newperm.add(i, num);                        
                    newList.add(newperm);
                }
            }
            ans = newList;
        }
        return ans;
    }
}
