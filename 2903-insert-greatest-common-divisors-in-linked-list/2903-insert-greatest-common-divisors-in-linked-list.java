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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            int hcf=highestcommonFactor(curr.val,curr.next.val);
            ListNode hcf1=new ListNode(hcf);
            hcf1.next=curr.next;
            curr.next=hcf1;
            curr=hcf1.next;


        }
        return head;
    }
    public int highestcommonFactor(int a ,int b){
        if(a==0){
            return b;
        }
         if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return highestcommonFactor(a-b,b);
        }
        return highestcommonFactor(a,b-a);
    }
}