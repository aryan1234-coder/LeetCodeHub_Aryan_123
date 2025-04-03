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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode leftPointer=head;
        ListNode rightPointer=head;

        ListNode curr=head;
        int count=1;
        while(curr!=null){
            if(count<k){
                leftPointer=leftPointer.next;
            }
            if(count>k){
                rightPointer=rightPointer.next;
            }
            curr=curr.next;
            count++;
        }
        int temp=leftPointer.val;
        leftPointer.val=rightPointer.val;
        rightPointer.val=temp;

        return head;





        
    }
}