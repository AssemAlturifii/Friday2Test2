package Second;

public class Queues<T> {
    private Node<T> root;



    public void enque(T value) {
        Node<T> node = new Node<T>(value);
        node.setNext(root);
        root = node;
    }

    public Node<T> deque() {

        Node<T> node = root;
        Node<T> previous = null;

        while (node.next() != null) {
            previous = node;
            node = node.next();
        }
        node = previous.next();
        previous.setNext(null);
        return node;
    }

    public void print (){
        Node current=root;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }


    }

}
