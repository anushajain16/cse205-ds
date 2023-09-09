public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int i=1;
        int find =size-n;
        ListNode prev= head;
        while(i<find){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}