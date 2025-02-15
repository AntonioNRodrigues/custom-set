# Custom Set Implementations

## HashSet
- **Temporal Complexity**:
    - Add: O(1)
    - Remove: O(1)
    - Contains: O(1)

**Explanation**:
The `CustomHashSet` uses an array of buckets and linked lists to handle collisions. The index is determined by the element's hash code. Adding, removing, and checking for the presence of an element is done in constant time, assuming an even distribution of elements.

## LinkedHashSet
- **Temporal Complexity**:
    - Add: O(1)
    - Remove: O(1)
    - Contains: O(1)

**Explanation**:
The `CustomLinkedHashSet` maintains insertion order using a doubly-linked list and a hash map. The hash map provides constant time complexity for add, remove, and contains operations.

## TreeSet
- **Temporal Complexity**:
    - Add: O(log n)
    - Remove: O(log n)
    - Contains: O(log n)

**Explanation**:
The `CustomTreeSet` maintains elements in sorted order using a binary search tree. The add and contains operations have logarithmic time complexity due to the nature of the binary search tree.
