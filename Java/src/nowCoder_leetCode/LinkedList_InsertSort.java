/**Sort a linked list using insertion sort.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if( head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        while( node.next != null){
            if( node.val > node.next.val){
                ListNode insert = node.next;
                node.next = node.next.next;
                ListNode point = dummy;
                while( insert.val > point.next.val)point = point.next;
                insert.next = point.next;
                point.next = insert;
            }//if
            else{
                node = node.next;
            }
        }//while
        return dummy.next;
    }
}