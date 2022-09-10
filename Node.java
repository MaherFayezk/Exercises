
public class Node {
    int value;
    int key;
    Node next;
    Node previous;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public Node() {
        this(0, 0);
    }
}