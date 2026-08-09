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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap <Integer,Integer> g=new HashMap<>();
        while(head!=null)
        {
            g.put(head.val,g.getOrDefault(head.val,0)+1);
            head=head.next;
        }
        ListNode re=new ListNode(10);
        ListNode dummy=re;
        for(int h:g.keySet())
        {
            if(g.get(h)==1)
            {
            ListNode r=new ListNode(h);
            dummy.next=r;
            dummy=dummy.next;
            }
        }
        return re.next;
    }
}