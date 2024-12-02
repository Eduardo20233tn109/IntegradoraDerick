public class Queue<E> {


    private static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> front;
    private Node<E> rear;
    public int size;


    public Queue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    //offer
    public boolean offer(E data){
        Node<E> newNode = new Node<>(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
        size++;
        return true;
    }

    //peek
    public E peek(){
        return (front != null) ? front.data : null;
    }

    //isEmpty
    public boolean isEmpty(){
        return size == 0;
    }

    //poll = eliminar
    public E poll(){
        if (isEmpty()) {
            return null;
        }
        E data = front.data;
        front = front.next;
        if (front == null) { //La cola se quedó vacía
            rear = null;
        }
        size--;
        return data;
    }

    public int size(){
        return this.size;
    }
}