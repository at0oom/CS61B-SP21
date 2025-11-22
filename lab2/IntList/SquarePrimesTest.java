package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(1, 7, 14, 15, 16, 11, 59);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1 -> 49 -> 14 -> 15 -> 16 -> 121 -> 3481", lst.toString());
        assertTrue(changed);
    }
}
