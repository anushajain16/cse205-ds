public class Q155 {
    ListNode head;
    public Q155() {
        head=null;
    }
    
    public void push(int val) {
        ListNode node = new ListNode(val);
        if(head==null){
            head=node;
            head.min=val;
        }
        else{
            head.next=node;
            node.prv=head;
            if(head.min<val)node.min = head.min;
            else node.min=val;
            head=node;
        }
    }
    
    public void pop() {
        head=head.prv;
        if(head!=null)head.next=null;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

class ListNode{
    int val;
    int min;
    ListNode next;
    ListNode prv;
    public ListNode(int val){
        this.val = val;
    }
}
