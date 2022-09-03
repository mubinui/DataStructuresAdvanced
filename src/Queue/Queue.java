package Queue;

public interface Queue {
    public int size();
    public boolean isEmpty();
    public void enqueue(int element);
    public int dequeue() throws NullPointerException;
    public int peek() throws NullPointerException;
    public void print();
}
