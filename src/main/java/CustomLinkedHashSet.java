import java.util.HashMap;
import java.util.Map;

public class CustomLinkedHashSet<E> {
    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;
    }

    private final Map<E, Node<E>> map;
    private Node<E> head;
    private Node<E> tail;

    public CustomLinkedHashSet() {
        map = new HashMap<>();
    }

    public boolean add(E element) {
        if (!map.containsKey(element)) {
            Node<E> node = new Node<>();
            node.data = element;
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
            map.put(element, node);
            return true;
        }
        return false;
    }

    public boolean remove(E element) {
        Node<E> node = map.remove(element);
        if (node != null) {
            if (node.prev != null) {
                node.prev.next = node.next;
            } else {
                head = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            } else {
                tail = node.prev;
            }
            return true;
        }
        return false;
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }
}
