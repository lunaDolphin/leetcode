public class App {
    public static void main(String[] args) throws Exception {
        MaxQueue mq = new MaxQueue();
        mq.max_value();
        mq.push_back(94);
        System.out.println(mq.pop_front());
        System.out.println(mq.pop_front());
        System.out.println(mq.pop_front());
        mq.push_back(89);
        System.out.println(mq.pop_front());
 
        System.out.println(mq.pop_front());

      

    }
}
