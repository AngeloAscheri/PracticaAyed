package Pila;

public class DoubleEndedQueue<T> extends Queue {
    private T tp1;

    public void enqueueFirst(T data) {
        // Implement the enqueueFirst operation here
        tp1 = data;
    }
}