package adts;

import interfaces.StackInterface;

public class ArrayStack<E> implements StackInterface<E> {
    private E[] elements;
    private int top;


    @SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
        elements = (E[]) new Object[capacity];
        top = -1;
    }
    @Override
    public void push(E element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        elements[top] = element;
    }
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        E poppedElement = elements[top];
        elements[top] = null;
        top--;
        return poppedElement;
    }
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[top];
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public boolean isFull() {
        return top == elements.length - 1;
    }

    @Override
	    public String toString() {
	    	StringBuilder sb = new StringBuilder();
	    for (int i = front; i <= rear; i++) {
	        sb.append(elements[i]).append(" ");
	    }
	    return sb.toString();
    }
}
