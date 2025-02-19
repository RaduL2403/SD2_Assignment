package griffith;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordTest {

    @Test
    public void testContains() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertTrue(word.contains('e'));
        assertFalse(word.contains('z'));
    }

    @Test
    public void testLength() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertEquals(5, word.length());
    }

    @Test
    public void testNotNull() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertNotNull(word.getLetters());
   
    }
}