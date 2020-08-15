import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] data = {4,2,1,3};

        ListNode head = new ListNode(data[0]);
        ListNode buf = head;

        for(int i = 1; i < data.length; i++){
            buf.next = new ListNode(data[i]);
            buf = buf.next;
        }
        
       ListNode l = sortList(head);
        while(l != null){
            System.out.println(l.val);
            l = l.next;
        }

    }

    
    public static ListNode sortList(ListNode head) {
        ListNode buf = head;
        int cnt = 0;

        while(buf != null){
            cnt++;
            buf = buf.next;
        }

        int[] data = new int[cnt];

        buf = head;
        for(int i = 0; i < cnt; i++){
            data[i] = buf.val;
            buf = buf.next;
        }

        Arrays.sort(data);

        head = new ListNode(data[0]);
        ListNode rst = head;
        for(int j = 1; j< data.length; j++){
            rst.next = new ListNode(data[j]);
            rst = rst.next;
        }

        return head;

    }
}
