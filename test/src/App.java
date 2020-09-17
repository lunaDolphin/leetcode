
public class App {
    public static void main(String[] args) throws Exception {
        int[] data = { 0,0,0,0,0,0,0,0,0,0,0 };

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

        ListNode data = head;
        ListNode dataSlow = head;
        ListNode cur = head.next;
        ListNode curSlow = head;

        while (cur != null) {
            while (cur != null && data != cur) {
                if (cur.val < head.val) {
                    curSlow.next = cur.next;
                    cur.next = head;
                    head = cur;

                    cur = curSlow.next;
                    data = head.next;
                    dataSlow = head;
                } else if (cur.val < data.val) {
                    // insert cur before data
                    curSlow.next = cur.next;
                    cur.next = data;
                    dataSlow.next = cur;

                    cur = curSlow.next;
                    data = head.next;
                    dataSlow = head;


                
                } else {
                    data = data.next;
                    dataSlow = dataSlow.next;
                }
            }

            if (cur != null) {
                data = head.next;
                dataSlow = head;
                cur = cur.next;
                curSlow = curSlow.next;
            }
        }

        return head;
    }

}
