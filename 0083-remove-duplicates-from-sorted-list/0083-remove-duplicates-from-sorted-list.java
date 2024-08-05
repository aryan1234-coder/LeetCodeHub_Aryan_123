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
    public ListNode deleteDuplicates(ListNode head) {

        TreeSet<Integer> set=new TreeSet<>();
        ListNode curr=head;

        while(curr!=null){
            set.add(curr.val);
            curr=curr.next;
        }

        
        ListNode curr1=new ListNode(0);
        ListNode curr2=curr1;
        for(int k:set){
            //  curr1=curr1.next;
            curr2.next=new ListNode(k);
             curr2=curr2.next;
            
        }

        return curr1.next;


      
        
    }
}