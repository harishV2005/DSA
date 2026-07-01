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
    public int numComponents(ListNode head, int[] nums) {
        int a=0;
        ListNode dummy=head;
        while(dummy!=null)
        {
            a=a+dummy.val;
            dummy=dummy.next;
        }
        for(int i=0;i<nums.length;i++)
        {
            a=a-nums[i];
        }
        return a;
        
    }
}