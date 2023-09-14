public class LinkedListCycle{
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean hasCycle(ListNode head) {
        ListNode pointer1 = head,pointer2 = head;
        while(pointer2!=null && pointer2.next!=null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
            if(pointer1 == pointer2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        list.head = new ListNode(10);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(30);
        ListNode temp = list.head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        list.head.next.next.next = list.head.next;
        System.out.println(hasCycle(list.head));
    }
}