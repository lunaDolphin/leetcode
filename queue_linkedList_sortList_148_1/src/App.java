
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
        if(head == null || head.next == null){
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        
        while( fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode middle = slow.next;
        slow.next = null;

        ListNode right = sortList(middle);
        ListNode left = sortList(head);
  
        return mergeList(left, right);
    }

     public  static ListNode mergeList(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;

        if(left.val < right.val){
            left.next = mergeList(left.next, right);
            return left;
        } else {
            right.next = mergeList(right.next, left);
            return right;
        }
        

    }
}
