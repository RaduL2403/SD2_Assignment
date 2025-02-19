//Radu Lupu 3130999
package griffith;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordTest {

    //Test method for contains 
    @Test
    public void testContains() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});  //creating a new word
        assertTrue(word.contains('e'));     //checking if the word contains the letter 'e'
        assertFalse(word.contains('z'));    //checking if the word contains the letter 'z'
    }

    //Test method for length
    @Test
    public void testLength() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});  //creating a new word
        assertEquals(5, word.length());                     //checking if the length of the word is 5
    }

    //Test method for getLetters
    @Test
    public void testNotNull() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});  //creating a new word
        assertNotNull(word.getLetters());                           //checking if the letters of the word are not null
   
    }
}