import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedHashSetTest {

    @Test
    void addElementSuccessfully() {
        CustomLinkedHashSet<String> set = new CustomLinkedHashSet<>();
        assertTrue(set.add("element"));
        assertTrue(set.contains("element"));
    }

    @Test
    void addDuplicateElement() {
        CustomLinkedHashSet<String> set = new CustomLinkedHashSet<>();
        set.add("element");
        assertFalse(set.add("element"));
    }

    @Test
    void removeElementSuccessfully() {
        CustomLinkedHashSet<String> set = new CustomLinkedHashSet<>();
        set.add("element");
        assertTrue(set.remove("element"));
        assertFalse(set.contains("element"));
    }

    @Test
    void removeNonExistentElement() {
        CustomLinkedHashSet<String> set = new CustomLinkedHashSet<>();
        assertFalse(set.remove("element"));
    }

    @Test
    void containsElement() {
        CustomLinkedHashSet<String> set = new CustomLinkedHashSet<>();
        set.add("element");
        assertTrue(set.contains("element"));
    }

    @Test
    void doesNotContainElement() {
        CustomLinkedHashSet<String> set = new CustomLinkedHashSet<>();
        assertFalse(set.contains("element"));
    }
}