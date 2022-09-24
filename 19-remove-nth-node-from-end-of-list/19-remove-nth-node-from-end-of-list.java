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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode slow=new ListNode();
        ListNode temp1=slow;
        if(head==null||head.next==null){
return null;
        }
       
        
        ListNode temp=head;
        while(n!=1){
            temp=temp.next;
            n--;
        }
       
        slow.next=head;
        while(temp.next!=null){
          slow=slow.next;
            temp=temp.next;
        }
        
        slow.next=slow.next.next;
        
        return temp1.next ;
    }
}