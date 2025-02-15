import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomTreeSetTest {

    @Test
    void addElementSuccessfully() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        assertTrue(set.add(5));
        assertTrue(set.contains(5));
    }

    @Test
    void addDuplicateElement() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        assertFalse(set.add(5));
    }

    @Test
    void containsElement() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        assertTrue(set.contains(5));
    }

    @Test
    void doesNotContainElement() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        assertFalse(set.contains(5));
    }


    @Test
    void removeElementSuccessfully() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        assertTrue(set.remove(5));
        assertFalse(set.contains(5));
    }

    @Test
    void removeNonExistentElement() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        assertFalse(set.remove(5));
    }

    @Test
    void removeElementWithLeftChild() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        set.add(3);
        assertTrue(set.remove(5));
        assertFalse(set.contains(5));
        assertTrue(set.contains(3));
    }

    @Test
    void removeElementWithRightChild() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        set.add(7);
        assertTrue(set.remove(5));
        assertFalse(set.contains(5));
        assertTrue(set.contains(7));
    }

    @Test
    void removeElementWithTwoChildren() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        set.add(3);
        set.add(7);
        assertTrue(set.remove(5));
        assertFalse(set.contains(5));
        assertTrue(set.contains(3));
        assertTrue(set.contains(7));
    }

    @Test
    void removeRootElement() {
        CustomTreeSet<Integer> set = new CustomTreeSet<>();
        set.add(5);
        assertTrue(set.remove(5));
        assertFalse(set.contains(5));
    }
}