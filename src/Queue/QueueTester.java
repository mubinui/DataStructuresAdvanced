package Queue;

public class QueueTester {
    public static void main(String[] args) {
        Queue queue = new ArrayQueue();
//        queue.dequeue(); Null pointer exception
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        queue.print();
    }
}
