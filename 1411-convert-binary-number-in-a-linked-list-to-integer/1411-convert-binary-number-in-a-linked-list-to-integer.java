/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {

        int ans=0;
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;

        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int c=0;
        for(int i=list.size()-1;i>=0;i--){
            ans=ans+(int)(Math.pow(2,c++)*list.get(i));
        }
        return ans;

        
    }
}