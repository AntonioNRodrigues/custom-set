public class CustomTreeSet<E extends Comparable<E>> {
    private static class Node<E> {
        E data;
        Node<E> left;
        Node<E> right;

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> root;

    public boolean add(E element) {
        if (root == null) {
            root = new Node<>(element);
            return true;
        }
        return addRecursive(root, element);
    }

    private boolean addRecursive(Node<E> current, E element) {
        int cmp = element.compareTo(current.data);
        if (cmp < 0) {
            if (current.left == null) {
                current.left = new Node<>(element);
                return true;
            }
            return addRecursive(current.left, element);
        } else if (cmp > 0) {
            if (current.right == null) {
                current.right = new Node<>(element);
                return true;
            }
            return addRecursive(current.right, element);
        }
        return false;
    }

    public boolean contains(E element) {
        return containsRecursive(root, element);
    }

    private boolean containsRecursive(Node<E> current, E element) {
        if (current == null) {
            return false;
        }
        int cmp = element.compareTo(current.data);
        if (cmp < 0) {
            return containsRecursive(current.left, element);
        } else if (cmp > 0) {
            return containsRecursive(current.right, element);
        }
        return true;
    }

    public boolean remove(E element) {
        if (root == null) {
            return false;
        }
        root = removeRecursive(root, element);
        return true;
    }

    private Node<E> removeRecursive(Node<E> current, E element) {
        if (current == null) {
            return null;
        }

        int cmp = element.compareTo(current.data);
        if (cmp < 0) {
            current.left = removeRecursive(current.left, element);
        } else if (cmp > 0) {
            current.right = removeRecursive(current.right, element);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            current.data = findMin(current.right).data;
            current.right = removeRecursive(current.right, current.data);
        }
        return current;
    }

    private Node<E> findMin(Node<E> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


}
