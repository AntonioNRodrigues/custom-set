import java.util.LinkedList;

public class CustomHashSet<E> {
    private static final int INITIAL_CAPACITY = 16;
    private final LinkedList<E>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashSet() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }

    private int getBucketIndex(E element) {
        return Math.abs(element.hashCode()) % buckets.length;
    }

    public boolean add(E element) {
        int index = getBucketIndex(element);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (!buckets[index].contains(element)) {
            buckets[index].add(element);
            return true;
        }
        return false;
    }

    public boolean remove(E element) {
        int index = getBucketIndex(element);
        if (buckets[index] != null && buckets[index].contains(element)) {
            buckets[index].remove(element);
            return true;
        }
        return false;
    }

    public boolean contains(E element) {
        int index = getBucketIndex(element);
        return buckets[index] != null && buckets[index].contains(element);
    }
}
