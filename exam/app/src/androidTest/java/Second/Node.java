package Second;

public class Node<T> {
    T data;
    Node<T>next;

    public Node(T value) {
        this.data = value;
    }
    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> next() {
        return next;
    }
}
