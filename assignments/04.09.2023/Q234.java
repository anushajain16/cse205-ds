public class Q234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode midNode = slow;
        ListNode prev=null;
        ListNode curr = midNode;
        ListNode temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode right = prev;
        ListNode left = head;
        while(right!=null){
            if(right.val!=left.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
}
