import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MixedEncodeTests {
    @Test
    void upperCaseTest1() {
        MaceroImpl test1 = new MaceroImpl("Marc", 3);
        StringBuilder expected = new StringBuilder("3.954 4.164 4.311 4.183 ");
        String actual = test1.encode();
        assertEquals(expected.toString(), actual);
    }

    @Test
    void upperCaseTest2() {
        MaceroImpl test1 = new MaceroImpl("Cervera", 6);
        StringBuilder expected = new StringBuilder("2.347 2.576 2.643 2.663 2.576 2.643 2.553 ");
        String actual = test1.encode();
        assertEquals(expected.toString(), actual);
    }

    @Test
    void upperCaseTest3() {
        MaceroImpl test1 = new MaceroImpl("Rosell", 11);
        StringBuilder expected = new StringBuilder("1.838 1.964 1.979 1.925 1.953 1.953 ");
        String actual = test1.encode();
        assertEquals(expected.toString(), actual);
    }
}
