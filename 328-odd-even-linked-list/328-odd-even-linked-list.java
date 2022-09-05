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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode curr=head.next;
        ListNode firstn=head.next;
        while(curr!=null&&curr.next!=null){
            
            temp.next=curr.next;
            temp=temp.next;
            ListNode ne=curr.next.next;;
            curr.next=ne;
            curr=ne;
        }
        
        temp.next=firstn;
        return head;
    }
}