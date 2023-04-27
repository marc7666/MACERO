import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: Marc Cervera Rosell
 * @project: MACERO
 * @date: 27/04/2023
 */
public class encodeTests {
    @Test
    void upperCaseTest1() {
        MaceroImpl test1 = new MaceroImpl("MARC", 3);
        StringBuilder expected = new StringBuilder("3.954 3.8 4.011 3.827 ");
        StringBuilder actual = test1.encode();
        assertEquals(expected.getClass(), actual.getClass());
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void upperCaseTest2() {
        MaceroImpl test1 = new MaceroImpl("CERVERA", 6);
        StringBuilder expected = new StringBuilder("2.347 2.363 2.459 2.486 2.363 2.459 2.33 ");
        StringBuilder actual = test1.encode();
        assertEquals(expected.getClass(), actual.getClass());
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void upperCaseTest3() {
        MaceroImpl test1 = new MaceroImpl("ROSELL", 11);
        StringBuilder expected = new StringBuilder("1.838 1.822 1.843 1.766 1.806 1.806 ");
        StringBuilder actual = test1.encode();
        assertEquals(expected.getClass(), actual.getClass());
        assertEquals(expected.toString(), actual.toString());
    }
}
