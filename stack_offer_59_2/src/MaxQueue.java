public class MaxQueue {
    Node head;
    Node sec;
    Node cur;
    Node saf;
    
    public MaxQueue() {
      head = new Node(0);
      cur = head;
      
      sec = new Node(0);
      saf = sec;
    }
    
    public int max_value() {
        if(sec.next == null){
            return -1;
        }
        return sec.next.val;
    }
    
    public void push_back(int value) {
        Node tmp = new Node(value);
        Node com = new Node(value);
        cur.next = tmp;
        tmp.pre = cur;
        cur = tmp;
        while(saf != sec && value > saf.val){
            saf = saf.pre;
        }
        saf.next = com;
        com.pre = saf;
        saf = com;
    }
    
    public int pop_front() {
        if(head.next == null || sec.next == null){
            return -1;
        }
        int data = head.next.val;
      
        head.next = head.next.next;
        if(head.next == null){
            cur = head;
        }

        if(data == sec.next.val){
            sec.next = sec.next.next;
            if(sec.next != null){
                sec.next.pre = sec;
            }else{
                saf = sec;
            }
        } 
      return data;
    }
}