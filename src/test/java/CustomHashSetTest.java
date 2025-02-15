import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CustomHashSetTest {

    @Test
    void addElementSuccessfully() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertTrue(set.add("element"));
        assertTrue(set.contains("element"));
    }

    @Test
    void addDuplicateElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        set.add("element");
        assertFalse(set.add("element"));
    }

    @Test
    void removeElementSuccessfully() {
        CustomHashSet<String> set = new CustomHashSet<>();
        set.add("element");
        assertTrue(set.remove("element"));
        assertFalse(set.contains("element"));
    }

    @Test
    void removeNonExistentElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertFalse(set.remove("element"));
    }

    @Test
    void containsElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        set.add("element");
        assertTrue(set.contains("element"));
    }

    @Test
    void doesNotContainElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertFalse(set.contains("element"));
    }

    @Test
    void addNullElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertThrows(NullPointerException.class, () -> set.add(null));
    }

    @Test
    void removeNullElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertThrows(NullPointerException.class, () -> set.remove(null));
    }

    @Test
    void containsNullElement() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertThrows(NullPointerException.class, () -> set.contains(null));
    }
}