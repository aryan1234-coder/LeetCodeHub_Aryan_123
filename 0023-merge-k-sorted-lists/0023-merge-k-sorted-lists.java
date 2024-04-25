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
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0 || lists==null){
            return null;
        }
        return mergeList(lists,0,lists.length-1);
    }
    public ListNode mergeList(ListNode[] lists,int i,int j){
        if(i==j){
            return lists[i];
        }
        if(i+1==j){
            return merge(lists[i],lists[j]);
        }
        int mid=i+(j-i)/2;
        ListNode left=mergeList(lists,i,mid);
        ListNode right=mergeList(lists,mid+1,j);

        return merge(left,right);

    }
    public ListNode merge(ListNode left,ListNode right){
         ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                curr.next=left;
                left=left.next;
            }
            else{
                curr.next=right;
                right=right.next;
            }
            curr=curr.next;
        }
 curr.next=left!=null?left:right;
 return dummy.next;
    }
}
