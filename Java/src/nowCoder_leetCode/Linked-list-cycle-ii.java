/*
Given a linked list, return the node where the cycle begins. If there is no cycle, returnnull.

Follow up:
Can you solve it without using extra space?
*/

/**
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
    public ListNode detectCycle(ListNode head) {
        try{
        	ListNode r = head;
        	if(head.next == null)return null;
        	ListNode p = head.next;
        	while( p != r && p.next.next != null){
            r = r.next;
            p = p.next.next;
        	}
        	if( p == r){
        	r = head;
        	p = head;
        	while( r.next != null){
            r = r.next;
            p.next = null;
            p = r;
        	}
        	return r;
        	}
          else return null;
        }catch(Exception e){
            return null;
        }
    }
}
