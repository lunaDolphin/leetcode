
public class App {
    public static void main(String[] args) throws Exception {
        int[] data = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        // int[] data = { 6,5,3,1,8,7,2,4 };
        // int[] data = { 1,3,4,3 };
        ListNode head = new ListNode(data[0]);
        ListNode cur = head;
        for (int i = 1; i < data.length; i++) {
            cur.next = new ListNode(data[i]);
            cur = cur.next;
        }
        head = insertionSortList(head);
        while (head != null) {
            System.out.println(head.val + ", ");
            head = head.next;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // ListNode newHead = new ListNode(Integer.MIN_VALUE);
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = head.next;
        ListNode pre = head;

        while (cur != null) {
            if(pre.val < cur.val){
                pre = cur;
                cur = cur.next;
            } else{
                ListNode buf = newHead;
                while(buf.next.val < cur.val && buf.next != cur){
                    buf = buf.next;
                }
                pre.next = cur.next;
                cur.next = buf.next;
                buf.next = cur;

                cur = pre.next;
            }
            
        }

        return newHead.next;
    }

}
