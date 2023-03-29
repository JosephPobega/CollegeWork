package interfaces;

import java.util.ArrayList;

public class ArrayListStack<E> implements StackInterface<E> {

    private ArrayList<E> stack;  // internal representation of the stack

    public ArrayListStack() {
        stack = new ArrayList<E>();
    }

    @Override
    public void push(E element) {
        stack.add(element);  // add the element to the end of the list
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(size() - 1);  // remove and return the last element in the list
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(size() - 1);  // return the last element in the list
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;  // an ArrayList-based stack is never full
    }

    public int size() {
        return stack.size();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (top to bottom):");
        for (int i = size() - 1; i >= 0; i--) {
            sb.append("\n").append(stack.get(i));
        }
        return sb.toString();
    }
}
