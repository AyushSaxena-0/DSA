public class O366QueueMain {
    public static void main(String[] args) throws Exception {
        O359CustomQueue queue=new O359CustomQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.display();
        queue.remove();
        queue.display();
    }
}
