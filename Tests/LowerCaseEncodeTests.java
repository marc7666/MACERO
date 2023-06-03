import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerCaseEncodeTests {
    @Test
    void lowerCaseTest1() {
        MaceroImpl test1 = new MaceroImpl("marc", 3);
        StringBuilder expected = new StringBuilder("4.27 4.164 4.311 4.183 ");
        String actual = test1.encode();
        assertEquals(expected.toString(), actual);
    }

    @Test
    void lowerCaseTest2() {
        MaceroImpl test1 = new MaceroImpl("cervera", 6);
        StringBuilder expected = new StringBuilder("2.565 2.576 2.643 2.663 2.576 2.643 2.553 ");
        String actual = test1.encode();
        assertEquals(expected.toString(), actual);
    }

    @Test
    void lowerCaseTest3() {
        MaceroImpl test1 = new MaceroImpl("rosell", 11);
        StringBuilder expected = new StringBuilder("1.975 1.964 1.979 1.925 1.953 1.953 ");
        String actual = test1.encode();
        assertEquals(expected.toString(), actual);
    }
}
