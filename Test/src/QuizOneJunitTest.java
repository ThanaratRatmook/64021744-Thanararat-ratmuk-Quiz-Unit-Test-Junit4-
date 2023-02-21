import org.junit.*;
import static org.junit.Assert.*;

public class QuizOneJunitTest {

    QuizOneJunit quiz;

    @Before
    public void setUp() {
        quiz = new QuizOneJunit();
    }

    @Test
    public void testSquare() {
        assertEquals(16, quiz.square(4));
        assertEquals(25, quiz.square(5));
        assertEquals(0, quiz.square(0));
        assertEquals(1, quiz.square(-1));
    }

    @Test
    public void testCountLetterA() {
        assertEquals(2, quiz.countLetterA("apple"));
        assertEquals(1, quiz.countLetterA("banana"));
        assertEquals(0, quiz.countLetterA("cherry"));
        assertEquals(0, quiz.countLetterA(""));
    }

    @Test
    public void testCheckTwoLetter() {
        assertTrue(quiz.checkTwoLetter("aa"));
        assertTrue(quiz.checkTwoLetter("abba"));
        assertFalse(quiz.checkTwoLetter("a"));
        assertFalse(quiz.checkTwoLetter("ab"));
        assertFalse(quiz.checkTwoLetter(""));
    }
}
