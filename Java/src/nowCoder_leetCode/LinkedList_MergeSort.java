
/**Sort a linked list in O(n log n) time using constant space complexity.
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode sortList(ListNode head) {
        if( head == null || head.next == null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;
        return merge( sortList(head), sortList(right));
    }

    private ListNode findMid (ListNode head){
        if( head == null ){
            return  head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode merge( ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                cur.next = head1;
                head1=head1.next;
            }else{
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;

        }
        if( head1 != null){
            cur.next = head1;
        }else if( head2 != null){
            cur.next = head2;
        }
        return dummy.next;
    }

}