

class MaxQueue {
    int[] src ;
    int[] sec ;
    int srcTail = 0;
    int srcHead = 0;
    int secTail = 0;
    int secHead = 0;
    
    public MaxQueue() {
       src = new int[10000];
       sec = new int[10000];
    }
    
    public int max_value() {
        if(secHead == secTail){
            return -1;
        }
        return sec[secHead];
    }
    
    public void push_back(int value) {
        src[srcTail++] = value;
        while(secHead < secTail && value > sec[secTail - 1]){
            sec[--secTail] = -1;
        }
        sec[secTail++] = value;
    }
    
    public int pop_front() {
        if(srcHead >= srcTail){
            return -1;
        }
        int data = src[srcHead++];
        if(data == sec[secHead]){
            sec[secHead++] = -1;
        }
        return data;
    }
}

