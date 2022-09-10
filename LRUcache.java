import java.util.HashMap;

class LRUCache {
    HashMap<Integer, Node> map;
    int capacity;
    Node head = new Node();
    Node tail = new Node();

    public LRUCache(int capacity) {
        this.map = new HashMap<>(capacity);
        this.capacity = capacity;
        this.head.next = this.tail;
        this.tail.previous = this.head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        removeNode(node);
        addNode(node);
        return node.value;
    }

    public void put(int key, int value) {

        Node node = map.get(key);
        if (node != null) {
            removeNode(node);
            node.value = value;
            addNode(node);
        } else {
            node = new Node(key, value);
            if (this.map.size() == this.capacity) {
                this.map.remove(this.tail.previous.key);
                removeNode(this.tail.previous);
            }
            addNode(node);
            this.map.put(key, node);

        }
    }

    public void addNode(Node node) {
        Node temp = this.head.next;
        this.head.next = node;
        node.next = temp;
        node.previous = this.head;
        temp.previous = node;
    }

    public void removeNode(Node node) {
        Node nodeNext= node.next;
        Node preNode=node.previous;
        nodeNext.previous=preNode;
        preNode.next=nodeNext;
        
    }

}
