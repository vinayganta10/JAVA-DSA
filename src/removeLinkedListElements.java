class removeLinkedListElements{
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        while(head!=null && head.val == val){
            head = head.next;
        }
        ListNode temp = head;
        ListNode prev = head;
        while(temp!=null){
            if(temp.val==val){
                prev.next = temp.next;
                temp = prev.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        removeLinkedListElements list = new removeLinkedListElements();
        list.head = new removeLinkedListElements.ListNode(10);
        list.head.next = new removeLinkedListElements.ListNode(20);
        list.head.next.next = new removeLinkedListElements.ListNode(10);
        list.head.next.next.next = new removeLinkedListElements.ListNode(40);
        removeLinkedListElements.ListNode temp = list.head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        removeElements(list.head,10);
        System.out.println("------------------");
        removeLinkedListElements.ListNode temp1 = list.head;
        while(temp1!=null){
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }
    }
}