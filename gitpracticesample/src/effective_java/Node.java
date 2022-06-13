package effective_java;

public class Node<T> {
    private T data;
    private Node<T> head;

    public Node(T data) {
        this.data = data;
        this.head = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
