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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Fhead=new ListNode(0);
        ListNode Ftail=Fhead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                 Ftail.next = list1;
                 list1 = list1.next;
            }
            else{
                Ftail.next = list2;
                list2 = list2.next;
            }
            Ftail = Ftail.next;
        }
        if(list1 != null){
            Ftail.next = list1;
            list1=list1.next;
        }
        if(list2 != null){
            Ftail.next = list2;
            list2=list2.next;
        }
    return Fhead.next;
}
}
