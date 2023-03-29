package adts;

import interfaces.QueueInterface;

public class ArrayQueueStack<E> implements QueueInterface<E> {

    private E[] elements;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
	public ArrayQueueStack(int capacity) {
        elements = (E[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E dequeuedElement = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return dequeuedElement;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == elements.length;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front; i <= rear; i++) {
            sb.append(elements[i]);
            if (i < rear) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
