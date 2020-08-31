public class App {
    public static void main(String[] args) throws Exception {
        MaxQueue mq = new MaxQueue();
        mq.push_back(1);
        mq.push_back(2);

        System.out.println(mq.max_value());
        System.out.println(mq.pop_front());
        System.out.println(mq.max_value());

    }
}
