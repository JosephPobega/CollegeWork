package interfaces;

import java.util.ArrayList;

public class ArrayListQueue<E> implements QueueInterface<E> {

    private ArrayList<E> queue;
    
    public ArrayListQueue() {
        queue = new ArrayList<E>();
    }

    @Override
    public void enqueue(E element) {
        queue.add(element); 
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false; 
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (top to bottom):");
        for (int i = size - 1; i >= 0; i--) {
            sb.append("\n").append(stack[i]);
        }
        return sb.toString();
    }
}
