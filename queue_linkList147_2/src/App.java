
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
        ListNode cur = head.next;
        ListNode pre = head;

        while (cur != null) {
          
                if (cur.val <= head.val) {
                    pre.next = cur.next;
                    cur.next = head;
                    head = cur;

                    cur = pre.next;

                } else if (cur.val > pre.val) {
                    // insert cur before data
                    pre = cur;
                    cur = cur.next;
                } else{
                    ListNode p = head;
                    while(p.next.val < cur.val && p.next != cur){
                        p = p.next;
                    }
                    // swap p.next and cur
                    pre.next = cur.next;
                    cur.next = p.next;
                    p.next = cur;
                    // move cur to next node
                    cur = pre.next;
                }
        }

        return head;
    }

}
