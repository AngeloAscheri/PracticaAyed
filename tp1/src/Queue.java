import java.util.*;
import java.util.LinkedList;

public class Queue<T> extends Sequence{

    private List<T> data;

    public Queue() {
        this.data = new LinkedList<>();
    }

    public void enqueue(T dato) {
        data.add(dato);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        return data.remove(0);
    }

    public T head() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}