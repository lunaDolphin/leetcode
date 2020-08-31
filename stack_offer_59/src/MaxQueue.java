import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {
    Queue <Integer> src;
    Deque <Integer> sec;
    
    public MaxQueue() {
        src = new LinkedList<>();
        sec = new LinkedList<>();
    }
    
    public int max_value() {
        if(sec.isEmpty()){
            return -1;
        }
        return sec.peek();
    }
    
    public void push_back(int value) {
        src.add(value);
        while(!sec.isEmpty() && value > sec.peekLast()){
            sec.pollLast();
        }
        sec.addLast(value);
    }
    
    public int pop_front() {
        if(src.isEmpty()){
            return -1;
        }
        int data = src.poll();
        if(data == sec.peekFirst()){
            sec.pollFirst();
        }
        return data;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */