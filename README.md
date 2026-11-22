# Custom Set Implementations

A small Java library providing from-scratch implementations of the three most common set data structures:

- **CustomHashSet** – hash table with chaining.
- **CustomLinkedHashSet** – hash table preserving insertion order.
- **CustomTreeSet** – self-balancing-free binary search tree (sorted order).

The project is built with **Maven** and targets **Java 25**.

## Features

- Generic, type-safe implementations (`CustomHashSet<E>`, `CustomLinkedHashSet<E>`, `CustomTreeSet<E extends Comparable<E>>`).
- Core set operations: `add`, `remove`, `contains`.
- Comprehensive unit tests with JUnit 5.
- No external runtime dependencies.

## Complexity

| Implementation | Add | Remove | Contains | Ordering |
|---|---|---|---|---|
| `CustomHashSet` | O(1) avg | O(1) avg | O(1) avg | None |
| `CustomLinkedHashSet` | O(1) avg | O(1) avg | O(1) avg | Insertion order |
| `CustomTreeSet` | O(log n) | O(log n) | O(log n) | Sorted |

### CustomHashSet
Uses an array of buckets, each a linked list to handle collisions. The bucket index is derived from the element's hash code. Operations are constant time on average, assuming an even distribution of elements. `null` elements are not supported and throw `NullPointerException`.

### CustomLinkedHashSet
Maintains insertion order with a doubly-linked list while using a `HashMap` for O(1) lookups. Add, remove and contains are constant time on average.

### CustomTreeSet
Maintains elements in sorted order using a binary search tree. Add, remove and contains have logarithmic time complexity. Duplicate elements are ignored.

## Project structure

```
custom-set/
├── pom.xml
└── src
    ├── main/java
    │   ├── CustomHashSet.java
    │   ├── CustomLinkedHashSet.java
    │   └── CustomTreeSet.java
    └── test/java
        ├── CustomHashSetTest.java
        ├── CustomLinkedHashSetTest.java
        └── CustomTreeSetTest.java
```

## Requirements

- Java 25 (JDK)
- Maven 3.9+

## Build and test

```bash
mvn clean test
```

To compile only:

```bash
mvn compile
```

## Usage

```java
CustomHashSet<String> hashSet = new CustomHashSet<>();
hashSet.add("apple");
hashSet.add("banana");
System.out.println(hashSet.contains("apple")); // true
hashSet.remove("apple");

CustomLinkedHashSet<String> linkedSet = new CustomLinkedHashSet<>();
linkedSet.add("first");
linkedSet.add("second");

CustomTreeSet<Integer> treeSet = new CustomTreeSet<>();
treeSet.add(5);
treeSet.add(3);
treeSet.add(7);
System.out.println(treeSet.contains(3)); // true
```

## License

This project is licensed under the terms of the [LICENSE](LICENSE) file.
