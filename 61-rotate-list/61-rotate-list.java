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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int n=0;
       while(temp!=null){
           n++;
           temp=temp.next;
           
       }
        int slide=k%n;
        if(slide==0){
            return head;
        }
        //ListNode prev=new ListNode();
        ListNode fast=head;
        while(slide!=0){
        
        slide--;
            fast=fast.next;
        }
    
    ListNode slow=head;
    ListNode ne= slow.next;
    
    while(fast!=null&&fast.next!=null){
                  
            slow=slow.next;
        ne=slow.next;
        fast=fast.next;
    }
    
    fast.next=head;
    slow.next=null;
    
    
    return ne;
}
}