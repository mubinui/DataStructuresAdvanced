package Queue;

import java.util.Arrays;

public class ArrayQueue implements Queue{
    int s = 0;
    int rear = -1;
    int front= -1;
    int [] memory = new int[5];
    @Override
    public int size() {
        return s;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void enqueue(int element) {
        if(isEmpty()){
            front = rear = 0;
            memory[0] = element;
            rear++;

        }
        else {
            if((memory.length)-1==rear){
                int temp [] = Arrays.copyOf(memory,memory.length*2);
                memory = temp.clone();
            }
            memory[rear++] = element;

        }
        s++;

    }

    @Override
    public int dequeue() throws NullPointerException {
        int output = -1;
        if(isEmpty()){
            throw new NullPointerException();
        }
        else {
            output = memory[front];
            memory[front]= 0;
            front++;
            s--;

        }
        return output;
    }

    @Override
    public int peek() throws NullPointerException {

        if(isEmpty()){
            throw new NullPointerException();
        }

        return memory[front];


    }

    @Override
    public void print() {
        if(isEmpty()){
            throw new NullPointerException();
        }
        else {
            for (int i =front; i <rear ; i++) {
                System.out.print(memory[i]+"->");

            }
            System.out.println();
        }

    }
}
