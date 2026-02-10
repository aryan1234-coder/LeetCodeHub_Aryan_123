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
    public void reorderList(ListNode head) {

        // firstly make an arrayList
        ArrayList<ListNode> list=new ArrayList<>();

        ListNode curr1=new ListNode(0);

        ListNode curr=head;
        while(curr!=null){
            list.add(curr);
            curr=curr.next;
        }
        int i=0;
        int j=list.size()-1;

        while(i<=j){
             curr1.next=list.get(i);
             curr1.next.next=list.get(j);
             curr1=curr1.next.next;
             i++;
             j--;
        }

        curr1.next=null;
    
        
    }
}